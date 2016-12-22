package com.zf.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by chris on 16/9/20.
 */
public class SimulatorProxy implements InvocationHandler {

	private Object obj;

	public SimulatorProxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("proxy_start");

		Object result = method.invoke(obj, args);

		System.out.println("proxy_end");

		return result;
	}

}
