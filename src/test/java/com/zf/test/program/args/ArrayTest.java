package com.zf.test.program.args;

import java.lang.reflect.Array;

/**
 * Created by chris on 2016/12/8.
 */
public class ArrayTest {

    public static void main(String[] args) {
        //        String[] y1 = new String[3];
//        String[] y = x.toArray(y1);
//        Object[] y2 = x.toArray();
//        for (String s : y1) {
//            System.out.println(s);
//        }
//        for (String s : y) {
//            System.out.println(s);
//        }
//        for (Object o : y2) {
//            String s = (String) o;
//            System.out.println(s);
//        }
//
//        String[] ary = {"1", "2", "3", "4"};
//        String[] copyAry = Arrays.copyOf(ary, 5);
//        for (String s : copyAry) {
//            System.out.println(s);
//        }
//
//
//        String[] copyAry1 = new String[3];
//        System.arraycopy(ary, 1, copyAry1, 0, 3);
//        for (String s : copyAry1) {
//            System.out.println(s);
//        }
//
//        // 没有构造函数
//        System.out.println(copyAry1.getClass().getConstructors().length);
//        System.out.println(copyAry1.getClass());
//
//        String[] ary1 = (String[]) Array.newInstance(String.class, 10);
//        for (String s : ary1) {
//            System.out.println(s);
//        }

        // 定义二维数组
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 第一维3, 第二维5
        int[] arrModel = new int[] { 3, 5 };
        Object arrObj = Array.newInstance(int.class, arrModel);
        System.out.println(Array.getLength(arrObj));
        System.out.println(Array.getLength(Array.get(arrObj, 2)));

    }

}
