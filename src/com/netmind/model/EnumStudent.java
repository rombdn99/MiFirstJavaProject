package com.netmind.model;

public enum EnumStudent {
	EXIT(4), ADD_STUDENT(1);

	private int value;

	private EnumStudent(int value) {
		this.value = value;
	}

	public static EnumStudent fromValue(int value) {
		for (EnumStudent my : EnumStudent.values()) {
			if (my.value == value) {
				return my;
			}
		}
		return null;
	}

	public int value() {
		return value;
	}
}
