package com.zf.test.program.args;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by chris on 16/12/2.
 */
public class MultiArgsTest {

	public static void main(String[] args) {
		MultiArgsTest test = new MultiArgsTest();
		test.print("hello");
		String[] ary = { "hello", "alexia" };
		test.print(null, ary);
        List<String> list = new ArrayList<String>();
        list.add("ddd");
        list.add("fff");

        test.print(null, list, "ggg");

	}

	// public void print(String... args) {
	// for (int i = 0; i < args.length; i++) {
	// out.println(args[i]);
	// }
	// }

	public void print(String test, Object... args) {
		for (int i = 0; i < args.length; i++) {
			out.println(args[i]);
		}
	}

	public void print(String test) {
		out.println("----------");
	}

}
