package com.phani.entity.sdp2;

import com.phani.commons.Commansutil;

public class Printer implements Commansutil {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static boolean flag = false;

	private Printer() {
		if (flag)
			throw new IllegalStateException("Not possible to create an Object");
		flag = true;

		System.out.println("o-param.Printer()");
	}

	// static factory method
	public static Printer getInstance() {
		return PrinterHolder.instance;

	}

	// business method
	public void print(String data) {

		System.out.println(data);
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is not supported");
	}

	// nested(private) inner classes
	private static class PrinterHolder {

		private static Printer instance = new Printer();

	}

	// to Stop Desrialization
	public Object readResolve() {

		// return PrinterHolder.instance;
		throw new IllegalArgumentException("Not possible");
	}
}
