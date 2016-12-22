package com.zf.test.multithreading;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by chris on 16/12/2.
 */
public class Test1 {

    public static void main(String[] args) {

        AtomicBoolean active = new AtomicBoolean();
        System.out.println(active.get());
        active.set(true);
        System.out.println(active.get());
        Boolean b = new Boolean(false);
        System.out.println(b);


    }

}
