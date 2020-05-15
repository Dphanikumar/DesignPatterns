package com.phani.test;

import java.lang.reflect.Constructor;
import java.util.logging.Logger;

import com.phani.sdp.Printer;

public class ReflectionAPITest {

	private static Logger logger = Logger.getLogger("ReflectionAPITest");

	public static void main(String[] args) {
		Printer p1 = null;

		p1 = Printer.getInstance();

		try {
			Class forName = Class.forName("com.phani.sdp.Printer");
			Constructor[] declaredConstructors = forName.getDeclaredConstructors();

			Printer p2 = (Printer) declaredConstructors[0].newInstance();
			declaredConstructors[0].setAccessible(true);
			System.out.println(p1.hashCode() + "->  " + p2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
