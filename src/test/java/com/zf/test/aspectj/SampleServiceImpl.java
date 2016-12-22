package com.zf.test.aspectj;

/**
 * Created by chris on 16/11/25.
 */
public class SampleServiceImpl implements SampleService {

	public int add(int x, int y) {
		return x + y;
	}

	public String getPassword(String username) {
		return "password";
	}

}
