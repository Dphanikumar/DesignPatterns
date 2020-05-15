package com.phani.test;

import com.phani.commons.MultiThread;

public class SingleTonMultiThreadTest {

	public static void main(String[] args) {
		MultiThread mt1 = new MultiThread();
		Thread th1 = new Thread(mt1);
		Thread th2 = new Thread(mt1);

		th1.start();
		th2.start();

	}

}
