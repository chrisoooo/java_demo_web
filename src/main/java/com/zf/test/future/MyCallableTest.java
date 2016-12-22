package com.zf.test.future;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallableTest implements Callable<Object> {
	// 实现call方法，作为线程执行体
	public Object call() {
		int i = 0;
//		for (; i < 100; i++) {
			// System.out.println(Thread.currentThread().getName() + "\t" + i);
//		}
		// call()方法可以有返回值

		return null;
	}

	public static void main(String[] args) {
		// 创建Callable对象
		MyCallableTest myCallableTest = new MyCallableTest();
		// 使用FutureTask来包装Callable对象
		FutureTask<Object> task = new FutureTask<Object>(myCallableTest);
//		for (int i = 0; i < 100; i++) {
			// System.out.println(Thread.currentThread().getName() + " \t" + i);
//			if (i == 20) {
				// 实质还是以Callable对象来创建、并启动线程
				new Thread(task, "callable").start();
//			}
//		}
		try {

        Object obj = task.get();


			// 获取线程返回值
			System.out.println("callable返回值：" + obj);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
