package com.zf.test.multithreading;

/**
 * Created by chris on 16/12/5.
 */
public class BarWorker1 implements Runnable {

	private static boolean exists = false;

	private String name;

	public BarWorker1(String name) {
		this.name = name;
	}

	public void run() {
		if (!exists) {
			exists = true;
			System.out.println(name + " enter");
			System.out.println(name + " working");
			System.out.println(name + " leave");
			exists = false;
		} else {
			System.out.println(name + " give up");
		}
	}

}