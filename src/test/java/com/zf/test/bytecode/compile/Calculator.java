package com.zf.test.bytecode.compile;

import javax.tools.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by chris on 16/11/29.
 */
public class Calculator {

	public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
		Double result = c.calculate("3+4");
		System.out.println(result);
	}

	public double calculate1() {
		System.out.println(555);
		return 555;
	}

	/**
	 * 计算加减乘除
	 *
	 * @param expr
	 * @return
	 * @throws CalculationException
	 */
	private double calculate(String expr) throws Exception {
		String className = "CalculatorMain";
		String methodName = "calculate";
		String source = "public class " + className
				+ " { public static double " + methodName + "() { return " + expr + "; } }";

		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

		// DiagnosticListener用于获取Diagnostic信息，Diagnostic信息包括：错误，警告和说明性信息
		// MyDiagnosticListener diagnosticListener = new MyDiagnosticListener();
		DiagnosticCollector diagnosticCollector = new DiagnosticCollector();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnosticCollector, Locale.ENGLISH,
				Charset.forName("utf-8"));
		StringSourceJavaObject sourceObject = new StringSourceJavaObject("CalculatorMain", source);
		Iterable<? extends JavaFileObject> fileObjects = Arrays.asList(sourceObject);
		JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, fileObjects);

		// 省略动态编译Java源代码的相关代码，参见上一节
		boolean result = task.call();
		if (result) {
			ClassLoader loader = Calculator.class.getClassLoader();
            System.out.println(loader.toString());
            try {
				Class<?> clazz = loader.loadClass("CalculatorMain"); //com.jike.zf.test.bytecode.compile.CalculatorMain
				Method method = clazz.getMethod("calculate", new Class<?>[] {});
				Object value = method.invoke(null, new Object[] {});
				return (Double) value;
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("内部错误。");
			}
		} else {
			throw new Exception("错误的表达式。");
		}
	}

	static class StringSourceJavaObject extends SimpleJavaFileObject {

		private String content = null;

		public StringSourceJavaObject(String name, String content) throws URISyntaxException

		{
			super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
			this.content = content;
			System.out.println("string:///" + name.replace('.', '/') + Kind.SOURCE.extension);
			System.out.println(content);
		}

		public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException

		{
			return content;
		}
	}

}
