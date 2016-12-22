package com.zf.test.bytecode.compile;

import javax.tools.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * 动态编译
 *
 * Created by chris on 16/11/29.
 */
public class CompilerTest {
	public static void main(String[] args) throws Exception {

		String source = "public class Main { public static void main(String[] args) {System.out.println(\"Hello World!\");} }";
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

		// DiagnosticListener用于获取Diagnostic信息，Diagnostic信息包括：错误，警告和说明性信息
		// MyDiagnosticListener diagnosticListener = new MyDiagnosticListener();
		DiagnosticCollector diagnosticCollector = new DiagnosticCollector();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnosticCollector, Locale.ENGLISH,
				Charset.forName("utf-8"));
		StringSourceJavaObject sourceObject = new StringSourceJavaObject("Main", source);
		Iterable<? extends JavaFileObject> fileObjects = Arrays.asList(sourceObject);
		JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, fileObjects);
		boolean result = task.call();
		if (result) {
			System.out.println("编译成功。");
		}

		/**
		 * 输出结果
		 */
		System.out.println(result);
		List list = diagnosticCollector.getDiagnostics();
		for (Object object : list) {
			Diagnostic d = (Diagnostic) object;
			System.out.println(d.getMessage(Locale.ENGLISH));
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
