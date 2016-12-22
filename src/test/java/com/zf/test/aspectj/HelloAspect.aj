package com.zf.test.aspectj;

/**
 * Created by chris on 16/11/25.
 */
public aspect HelloAspect {

    pointcut HelloWorldPointCut(): execution(* com.zf.test.aspectj.HelloWorld.main(..));

    before(): HelloWorldPointCut(){
        System.out.println("Hello world");
    }

}
