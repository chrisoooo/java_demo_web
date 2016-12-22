package com.zf.test.program.args;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 *
 * Created by chris on 2016/12/7.
 */
public class GenericityTest<T> {

    public static <T> void out(T t) {
        System.out.println(t);
    }


    public void p() {
        out("findingsea");
        out(123);
        out(11.11, 34.34);
        out(true);
    }

    public static void main(String[] args) {

//        GenericityTest<Integer> t = new GenericityTest();
//        t.p();

        Class<? extends Integer> c = (Class<? extends Integer>) new Integer(112).getClass();
        System.out.println(c.getClasses());

        Class<?> c1 = int.class;
        System.out.println(c1);


        List<String> x = new ArrayList();
        x.add("a");
        for (String s : x) {
            System.out.println(s);
        }





    }


    public static <T> void out(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

//    public static void main(String[] args) {
//        out("findingsea", 123, 11.11, true);
//    }

}
