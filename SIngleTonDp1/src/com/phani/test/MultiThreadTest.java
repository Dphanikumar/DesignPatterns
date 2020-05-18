package com.phani.test;

public class MultiThreadTest {

	public static void main(String[] args) {

		SingleTonThread singleTonThread = new SingleTonThread();

		Thread th = new Thread(singleTonThread);
		Thread th1 = new Thread(singleTonThread);

		th.start();
		th1.start();

	}

}
