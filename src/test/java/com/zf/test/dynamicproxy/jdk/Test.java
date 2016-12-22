package com.zf.test.dynamicproxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.*;

/**
 * Created by chris on 16/11/28.
 */
public class Test {

	public static void main(String[] args) {
//		IService aService = new Service();
//		ServiceHandler handler = new ServiceHandler(aService);
//		// Proxy为InvocationHandler实现类动态创建一个符合某一接口的代理实例
//		IService aServiceProxy = (IService) Proxy.newProxyInstance(aService.getClass().getClassLoader(), aService
//				.getClass().getInterfaces(), handler);
//		// 由动态生成的代理对象来aServiceProxy 代理执行程序，其中aServiceProxy 符合Service接口
//		aServiceProxy.add();
//		System.out.println();
//		aServiceProxy.update();
//        System.out.println(aServiceProxy.getClass());

        // 打印出动态类
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", Service.class.getInterfaces());
        System.out.println(classFile);


        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw

            FileOutputStream out = new FileOutputStream("/Users/chris/Desktop/output.class");
            out.write(classFile); // \r\n即为换行
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
