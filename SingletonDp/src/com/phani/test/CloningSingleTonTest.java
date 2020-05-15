package com.phani.test;

import com.phani.sdp.Printer;

public class CloningSingleTonTest {

	public static void main(String[] args) {
		Printer p1 = null;
		Printer p2 = null;
		Printer p3 = null;

		p1 = Printer.getInstance();
		try {
			p2 = (Printer) p1.clone();
			System.out.println(p1.hashCode() + " " + p2.hashCode());
			p3 = (Printer) p2.clone();
			System.out.println(p3.hashCode());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
