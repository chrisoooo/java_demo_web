package com.zf.test.program.enums;

/**
 * Created by chris on 16/12/5.
 */
public class Test {

	public enum WeekDayEnum1 {

		Mon1, Tue1, Wed1, Thu1, Fri1, Sat1, Sun1;

		private int index;

        private WeekDayEnum1() {
		}

        private WeekDayEnum1(int idx) {
			this.index = idx;
		}

		public int getIndex() {
			return index;
		}

	}

	public static void main(String[] args) {
		// 读取当天的信息
		Test today = new Test();
        WeekDayEnum1 dd = WeekDayEnum1.Tue1;

		// 根据日期来选择进行活动
		switch (dd) {
		case Mon1:
			System.out.println("Mon");
			break;
		case Tue1:
			System.out.println("Tue");
			break;
		case Wed1:
			System.out.println("Wed");
			break;
		case Thu1:
			System.out.println("Thu");
			break;
		case Fri1:
			System.out.println("Fri");
			break;
		case Sat1:
			System.out.println("Sat");
			break;
		case Sun1:
			System.out.println("Sun");
			break;
		}

//        // 工具类
//        for(WeekDayEnum1 day : EnumSet.range(WeekDayEnum1.Mon, WeekDayEnum1.Fri)) {
//            System.out.println(day);
//        }
//
//        EnumSet<WeekDayEnum1> subset = EnumSet.of(WeekDayEnum1.Mon, WeekDayEnum1.Wed);
//        for (WeekDayEnum1 day : subset) {
//            System.out.println(day);
//        }

	}

}
