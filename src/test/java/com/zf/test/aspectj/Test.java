package com.zf.test.aspectj;

/**
 * Created by chris on 16/11/25.
 */
public class Test {

    public static void main(String[] args) {

        SampleServiceImpl impl = new SampleServiceImpl();
        int i = impl.add(1, 2);
        System.out.println(i);
        String s = impl.getPassword(null);
        System.out.println(s);


    }


}
