package com.jpf.J2EE.dataAccessObject.base;
/**
 * 创建POJO类
 * @author Administrator
 *
 */
public class Student {
	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
