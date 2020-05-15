package com.phani.test;

import com.phani.entity.Printer;

public class SingleTonNormalTest1 {

	public static void main(String[] args) {

		Printer p1 = null;

		p1 = Printer.getInstance();

		Printer p2 = null;

		p2 = Printer.getInstance();
		System.out.println(p1.hashCode()+" "+p2.hashCode());

	}

}
