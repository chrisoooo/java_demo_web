package com.zf.test.program.base;

import java.util.Date;

/**
 * Created by chris on 2016/12/7.
 */
public class PrimaryTest {

    public static void main(String[] args) {

//        int i = 1 << 3;
//        System.out.println(i);
//
//        int i1 = 2 >> 0;
//        System.out.println(i1);
//
//        int i2 = 0x0FFFFFF0;
//        System.out.println(i2);

//        PrimaryTest pt = new PrimaryTest();
//        pt.effective();

        // 矩阵赋值,double8字节,Double8+8+8+gc字节
        //PrimaryTest pt = new PrimaryTest();
        //pt.getBytesUsingPrimitives(1000);

        //矩阵相乘,double11s和Double21s区别
        PrimaryTest pt = new PrimaryTest();
        pt.multiply(pt.getBytesUsingPrimitives(1000), pt.getBytesUsingPrimitives(1000));



    }


    public void effective() {
        Long startDate = new Date().getTime();

        Long sum = 0L; // uses Long, not long
        for(long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);

        int i = 0x7fffffff;
        System.out.println(i);

        System.out.println(new Date().getTime() - startDate);
    }

    public double[][] getBytesUsingPrimitives(int n)
    {
        System.gc();   // force garbage collection
        long memStart = Runtime.getRuntime().freeMemory();
        double[][] a = new double[n][n];

        // put some random values in the matrix
        for (int i = 0;  i < n;  ++i)
        {
            for (int j = 0; j < n;  ++j)
                a[i][j] = Math.random();
        }

        long memEnd = Runtime.getRuntime().freeMemory();

        System.out.println(memStart - memEnd);
        return a;
    }

    public Object[][] multiply(double[][] a, double[][] b)
    {
        long startTime = new Date().getTime();
//        if (!checkArgs(a, b))
//            throw new IllegalArgumentException("Matrices not compatible for multiplication");

        int nRows = a.length;
        int nCols = b[0].length;

        Object[][] result = new Object[nRows][nCols];

        for (int rowNum = 0;  rowNum < nRows;  ++rowNum)
        {
            for (int colNum = 0;  colNum < nCols;  ++colNum)
            {
                double sum = 0.0;

                for (int i = 0;  i < a[0].length;  ++i)
                    sum += a[rowNum][i]*b[i][colNum];

                result[rowNum][colNum] = sum;
            }
        }

        long endTime = new Date().getTime();
        System.out.println(endTime - startTime);
        return result;
    }


}
