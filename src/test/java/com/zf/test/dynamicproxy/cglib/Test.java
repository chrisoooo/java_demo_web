package com.zf.test.dynamicproxy.cglib;

/**
 * Created by chris on 16/11/28.
 */
public class Test {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		// base为生成的增强过的目标类
		Base base = (Base) BaseFactory.getInstance(proxy);
		base.add();
	}

}
