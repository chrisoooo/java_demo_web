package com.zf.test.program.args;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 2016/12/8.
 */
public class ListTest {

    public static void main(String[] args) {

        List l = new ArrayList();


        int oldCapacity = 4;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);

        Integer i1 = 1;

        int i = 1;
        System.out.println(int.class.getSimpleName());
        System.out.println(i1 instanceof Integer);

        java.lang.Void v = null;


        //Class.getPrimitiveClass("void");

        try {
            Class.forName("oracle.driven");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
