package com.zf.test;

import com.zf.test.itf.ISimulator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by chris on 16/9/20.
 */
public class Test {

	public static void main(String[] args) throws Exception {

		 ISimulator obj = new Simulator();

		 InvocationHandler handler = new SimulatorProxy(obj);

		 ISimulator obj1 = (ISimulator)
		 Proxy.newProxyInstance(handler.getClass().getClassLoader(),
		 obj.getClass()
		 .getInterfaces(), handler);

		 Short result = obj1.simulate(0, 0l, null);
		 System.out.println("result:" + result);

	}

}
