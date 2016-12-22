package com.zf.test.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Nashorn JavaScript
 *
 * Created by chris on 2016/12/12.
 */
public class Java8Test3 {

	public static void main(String args[]) {
        // java中调用js
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

		String name = "Runoob";
		Integer result = null;

		try {
			nashorn.eval("print('" + name + "')");
			result = (Integer) nashorn.eval("10 + 2");

		} catch (ScriptException e) {
			System.out.println("执行脚本错误: " + e.getMessage());
		}

		System.out.println(result.toString());
	}

// js中调用java
//    var BigDecimal = Java.type('java.math.BigDecimal');
//
//    function calculate(amount, percentage) {
//
//        var result = new BigDecimal(amount).multiply(
//                new BigDecimal(percentage)).divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_EVEN);
//
//        return result.toPlainString();
//    }
//
//    var result = calculate(568000000000000000023,13.9);
//    print(result);

}
