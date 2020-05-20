package com.phani.singleton;

public class SingleTonclass {

	// instance of singleton class
	private static SingleTonclass INSTANCE;

	/*
	 * to stop object creation outside of the class take private consructor it will
	 * controls 90% of creating object outside of the class
	 */

	private SingleTonclass() {

	}

//	take static factory method to create and return same class or diff class object

	public static SingleTonclass getInstance() {

		if (INSTANCE == null)
			INSTANCE = new SingleTonclass();

		return INSTANCE;

	}

}
