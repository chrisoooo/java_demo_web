package com.zf.test.dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by chris on 16/11/28.
 */
public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// 添加切面逻辑（advise），此处是在目标类代码执行之前，即为MethodBeforeAdviceInterceptor。
		System.out.println("before-------------");
		// 执行目标类add方法
		methodProxy.invokeSuper(o, objects);
		// 添加切面逻辑（advise），此处是在目标类代码执行之后，即为MethodAfterAdviceInterceptor。
		System.out.println("after--------------");
		return null;
	}

}
