package com.phani.test;

import com.phani.sdp.Printer;

public class SingletonTest1 {
	public static void main(String[] args) {
		// creating printer Object using new Operator

		Printer p1 = null;
		Printer p2 = null; // p1=new Printer();

		p1 = Printer.getInstance();
		p2 = Printer.getInstance();

		boolean p = (p1 == p2) ? true : false;
		System.out.println(p);

		p1.print("Welcome");
		p2.print("To the world");

		try {
			Class.forName("com.phani.sdp.Printer");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
