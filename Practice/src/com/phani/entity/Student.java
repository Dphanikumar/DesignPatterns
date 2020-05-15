package com.phani.entity;

import com.phani.cloning.Commans;

public class Student extends Commans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Student INSTANCE;

	public static Student getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Student();
		return INSTANCE;
	}

	private Student() {

	}

	/*
	 * public Object readResolve() { System.out.println("Student.readResolve()");
	 * return INSTANCE;
	 * 
	 * }
	 */
	public Object readResolve() {
		return new IllegalStateException("Cannot create an obejct for the SingleTon class outside of the class");

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new IllegalStateException("Object creation is not worked for the SingletonClass out side the class");
	}

}
