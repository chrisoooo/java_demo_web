package com.zf.test.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chris on 16/12/2.
 */
@Component
public class TestBean1 {

    @Autowired
    private TestBean testBean;

    public void printTest() {
        System.out.println("TestBean1_start");
        testBean.printTest();
        System.out.println("TestBean1_end");
    }

}
