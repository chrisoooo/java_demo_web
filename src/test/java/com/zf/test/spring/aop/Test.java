package com.zf.test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chris on 16/12/2.
 */
public class Test {

	public static void main(String[] arge) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean bean = context.getBean(TestBean.class);

		bean.printTest();
	}

}
