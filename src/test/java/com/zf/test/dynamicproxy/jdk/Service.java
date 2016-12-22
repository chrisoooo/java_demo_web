package com.zf.test.dynamicproxy.jdk;

/**
 * Created by chris on 16/11/28.
 */
public class Service implements IService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see jdkproxy.Service#add()
	 */
	public void add() {
		System.out.println("AService add>>>>>>>>>>>>>>>>>>");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jdkproxy.Service#update()
	 */
	public void update() {
		System.out.println("AService update>>>>>>>>>>>>>>>");
	}

}
