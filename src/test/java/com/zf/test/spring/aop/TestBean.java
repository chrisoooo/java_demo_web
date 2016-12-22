package com.zf.test.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by chris on 16/11/23.
 */
@Component
public class TestBean {

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void printTest() {
		System.out.println("test Bean");
	}
}
