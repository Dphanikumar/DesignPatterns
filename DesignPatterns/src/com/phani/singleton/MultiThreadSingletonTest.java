package com.phani.singleton;

public class MultiThreadSingletonTest {

	public static void main(String[] args) {

		MultiThreadSingleton singleton = null;
		Thread req1 = null;
		Thread req2 = null;
		singleton = new MultiThreadSingleton();

		req1 = new Thread(singleton);
		req2 = new Thread(singleton);
		req1.start();
		req2.start();

	}

}
