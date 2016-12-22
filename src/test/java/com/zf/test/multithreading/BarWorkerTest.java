package com.zf.test.multithreading;

/**
 * Created by chris on 16/12/5.
 */
public class BarWorkerTest {

    public static void main(String[] args) {
        BarWorker bw = new BarWorker("ddd");
        new Thread(bw).start();


    }

}
