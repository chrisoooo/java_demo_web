package com.zf.test.bytecode.advice;

//import org.objectweb.asm.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by chris on 16/11/30.
 */
public class TestASM { //extends ClassLoader implements Opcodes {

//	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException,
//			InvocationTargetException, SecurityException, InstantiationException {
//		ClassReader cr = new ClassReader(HelloWorld.class.getName());
//		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
//		ClassAdapter adapter = new TestClassAdapter(cw);
//		cr.accept(adapter, 0);
//
//		byte[] code = cw.toByteArray();
//
//		// 自定义加载器
//		TestASM loader = new TestASM();
//		Class<?> appClass = loader.defineClass(null, code, 0, code.length);
//		appClass.getMethods()[0].invoke(appClass.newInstance(), new Object[] {});
//
//	}
//
//	public static class TestClassAdapter extends ClassAdapter {
//
//		public TestClassAdapter(ClassVisitor classVisitor) {
//			super(classVisitor);
//		}
//
//		public MethodVisitor visitMethod(int arg, String name, String descriptor, String signature, String[] exceptions) {
//			MethodVisitor mv = super.visitMethod(arg, name, descriptor, signature, exceptions);
//			if (name.equals("sayHello")) {
//				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
//				mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J");
//				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(J)V");
//			}
//			return mv;
//		}
//	}

}
