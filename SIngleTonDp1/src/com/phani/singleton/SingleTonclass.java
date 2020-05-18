package com.phani.singleton;

public class SingleTonclass {

	private static SingleTonclass INSTANCE;

	private SingleTonclass() {
		System.out.println("SingleTonclass.SingleTonclass()");

	}

	public static SingleTonclass getInstance() {

		System.out.println("Veera Lakshmi supraja");
		System.out.println("Veera Lakshmi supraja");
		System.out.println("Veera Lakshmi supraja");
		System.out.println("Veera Lakshmi supraja");
		System.out.println("Veera Lakshmi supraja");
		System.out.println("Veera Lakshmi supraja");
		System.out.println("Veera Lakshmi supraja");
		if (INSTANCE == null) {
			synchronized (SingleTonclass.class) {
				if (INSTANCE == null)
					INSTANCE = new SingleTonclass();

			}
		}

		// each and every time new object will be created
		return INSTANCE;

	}

	// what are factory methods (a method that returns same class object or diff
	// class obejct is called facrory method)

	public static void main(String[] args) {

		SingleTonclass v1 = getInstance();
		SingleTonclass v2 = getInstance();
		System.out.println(v1.hashCode() + " " + v2.hashCode());

	}
}
