package com.phani.entity.sdp3;

public enum Printer {

	INSTANCE;

	public void print(String msg) {
		System.out.println(msg);

	}

	public static Printer getInstance() {

		System.out.println("ENUM:Printer.getInstance()");
		return INSTANCE;
	}
}
