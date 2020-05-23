package com.phani.singleton;

import java.io.Serializable;

public class SingleTonclass implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// instance of singleton class
	private static SingleTonclass INSTANCE;

	/*
	 * to stop object creation outside of the class take private consructor it will
	 * controls 90% of creating object outside of the class
	 */

	private SingleTonclass() {
		System.out.println("SingleTonclass.SingleTonclass()");

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new IllegalAccessError("Cloning is not supported on Singleton class");
	}

//	take static factory method to create and return same class or diff class object

	public static SingleTonclass getInstance() {

		if (INSTANCE == null)
			INSTANCE = new SingleTonclass();

		return INSTANCE;

	}

	public Object readResolve() throws IllegalAccessException {
		System.out.println("SingleTonclass.readResolve()");
		throw new IllegalAccessException("Desrialization not possible on Singleton classes");
	}

}
