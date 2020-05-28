package com.phani.test;

import com.phani.multi.MultiThread;

public class SingletonMultiThreadTest {

	public static void main(String[] args) {

		MultiThread multiThread = new MultiThread();

		Thread th1 = new Thread(multiThread);
		Thread th2 = new Thread(multiThread);
		th1.start();

		th2.start();

	}

}
