package com.phani.test;

import com.phani.singleton.SingleTonclass;

public class SingleTonThread implements Runnable {

	@Override
	public void run() {
		SingleTonclass s1 = SingleTonclass.getInstance();

		System.out.println(s1.hashCode() + " " + Thread.currentThread().getName());

	}

}
