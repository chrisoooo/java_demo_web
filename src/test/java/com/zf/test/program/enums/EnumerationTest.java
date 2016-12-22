package com.zf.test.program.enums;

/**
 * Created by chris on 16/12/5.
 */
public class EnumerationTest {

    public static void main(String... args) {

        // 读出客户端传递来的枚举值
        WeekDayEnum day = WeekDayEnum.Mon;

        // 用 switch 方式来比较枚举对象
        switch (day) {
            case Mon:
                System.out.println("Do Monday work");
                break;
            case Tue:
                System.out.println("Do Tuesday work");
                break;
            case Wed:
                System.out.println("Do Wednesday work");
                break;
            case Thu:
                System.out.println("Do Thursday work");
                break;
            case Fri:
                System.out.println("Do Friday work");
                break;
            case Sat:
                System.out.println("Do Saturday work");
                break;
            case Sun:
                System.out.println("Do Sunday work");
                break;
            default:
                System.out.println("I don't know which is day");
                break;
        }
    }
}