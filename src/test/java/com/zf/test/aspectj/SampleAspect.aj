package com.zf.test.aspectj;

import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by chris on 16/11/25.
 */
public aspect SampleAspect {

    /**
     * 切入点：SampleService继承树中所有 public 且以 add 开头的方法。SampleServiceImpl#add(int,int)方法满足这个条件。
     */
    public pointcut serviceAddMethods(): execution(public * com.zf.test.aspectj.SampleService+.add*(..));

    Object around(): serviceAddMethods(){
        Object oldValue = proceed();
        System.out.println("原值是：" + oldValue);
        return Integer.MIN_VALUE;
    }

//    /**
//     * 切入点：SampleService继承树中所有标注了AuthCheck的方法。
//     */
//    public pointcut serviceAuthCheckAnnotatedMethods(): execution(* org.opoo.samples.aspectj.SampleService+.*(..)) && @annotation(AuthCheck);
//
//    before(): serviceAuthCheckAnnotatedMethods(){
//        if (1 == 1) {//权限检查代码
//            throw new IllegalStateException("权限不足");
//        }
//    }

    /**
     * 切入点：SampleService继承树中所有 public 的方法。
     */
    public pointcut serviceAllPublicMethods(): execution(public * com.zf.test.aspectj.SampleService+.*(..));

    after(): serviceAllPublicMethods(){
        MethodSignature methodSignature = (MethodSignature) thisJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("[LOG] 方法被调用了: " + method);
    }

}
