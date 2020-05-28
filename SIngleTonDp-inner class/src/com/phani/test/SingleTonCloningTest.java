package com.phani.test;

import com.phani.entity.Printer;

public class SingleTonCloningTest {
	public static void main(String[] args) {

		Printer p1 = null;

		p1 = Printer.getInstance();

		Printer p2 = null;
		try {
			p2 = (Printer) p1.clone();

			System.out.println(p1.hashCode() + " " + p2.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
