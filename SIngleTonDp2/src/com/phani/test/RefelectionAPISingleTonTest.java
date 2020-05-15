package com.phani.test;

import java.lang.reflect.Constructor;

import com.phani.entity.Printer;

public class RefelectionAPISingleTonTest {

	public static void main(String[] args) {
		Printer p1 = null;

		p1 = Printer.getInstance();
		Printer p2 = null;

		try {
//creating the obejct by using the Class.forName() 
			Class forName = Class.forName("com.phani.entity.Printer");

//getting all the constructors  from the particular class
			Constructor[] declaredConstructors = forName.getDeclaredConstructors();

			// setting accessiblity to acces the constructors
			declaredConstructors[1].setAccessible(true);
			p2 = (Printer) declaredConstructors[1].newInstance();
			System.out.println(p1.hashCode() + " " + p2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
