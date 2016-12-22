package com.zf.test.program.enums;

/**
 * Created by chris on 16/12/5.
 */
public enum WeekDayEnum {

	Mon(1), Tue(2), Wed(3), Thu(4), Fri(5), Sat(6), Sun(7);

	private int index;

	WeekDayEnum(int idx) {
		this.index = idx;
	}

	public int getIndex() {
		return index;
	}

}
