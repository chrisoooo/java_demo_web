package com.zf.test;

import com.zf.test.itf.ISimulator;

/**
 * Created by chris on 16/9/20.
 */
public class Simulator implements ISimulator {

	@Override
	public short simulate(int arg1, long arg2, String arg3) throws Exception {

		System.out.println("simulate");

		return 0;
	}

}
