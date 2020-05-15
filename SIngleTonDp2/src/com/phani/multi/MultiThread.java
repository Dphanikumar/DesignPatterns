package com.phani.multi;

import com.phani.entity.Printer;

public class MultiThread implements Runnable {

	@Override
	public void run() {
		Printer p1 = null;

		p1 = Printer.getInstance();

		System.out.println(p1.hashCode() + " " + Thread.currentThread().getName());
	}

}
