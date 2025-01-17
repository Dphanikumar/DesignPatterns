package com.phani.sdp;

import com.phani.cloning.Commansutil;

/**
 * @author user
 *
 */
public class Printer implements Commansutil {

	private static final long serialVersionUID = 345L;
	private static Printer INSTANCE = null;
	private static boolean FLAG = false;

	private Printer() {
		if (FLAG==true) { //to stop refelection api bases cionstrucor access.
			throw new IllegalStateException("Object is allready created");
		}
		FLAG = true;

		System.out.println("Printer :: 0-param Cons");

	}

	// throwing an exception (Best for the practice purpose)y

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is not supported on singleton classes");
	}

	/*
	 * // returning an object which is created
	 * 
	 * @Override public Object clone() throws CloneNotSupportedException { // TODO
	 * Auto-generated method stub return INSTANCE; }
	 */

	/*
	 * // returning the this .
	 * 
	 * @Override public Object clone() throws CloneNotSupportedException { // TODO
	 * Auto-generated method stub return this; }
	 */
	/*
	 * public static Printer getInstance() { if (INSTANCE == null) INSTANCE = new
	 * Printer();
	 * 
	 * return INSTANCE;
	 * 
	 * }
	 */
	// 1.for eager instanciation
	// private static Printer INSTANCE = new Printer();
	/*
	 * public static Printer getInstance() { return INSTANCE; }
	 */
	/*
	 * 2.for eager instantiation
	 * 
	 * private static Printer INSTANCE;
	 * 
	 * 
	 * static { INSTANCE = new Printer(); }
	 * 
	 * public static Printer getInstance() { return INSTANCE; }
	 */

	/*
	 * 3.using the synchronized keyword on the method level private static Printer
	 * INSTANCE; public synchronized static Printer getInstance() {
	 * 
	 * if (INSTANCE == null) INSTANCE = new Printer(); return INSTANCE;
	 * 
	 * }
	 */

	/*
	 * // private static Printer INSTANCE; // placing the synchronization for some
	 * code
	 */
	public static Printer getInstance() {
		// here memory issues is solved by synchronized block
		// here performance issues is solved by double null check
		if (INSTANCE == null) {
			synchronized (Printer.class) {
				if (INSTANCE == null) {
					INSTANCE = new Printer();
				}
			}
		}
		return INSTANCE;

	}

	// static factrory method to create a Object creation by checking if INSTNACE is
	// null or not
	// lazy instantiation

	/*
	 * public static Printer getInstance() { if (INSTANCE == null) INSTANCE = new
	 * Printer();
	 * 
	 * return INSTANCE;
	 * 
	 * }
	 */

	/*
	 * // solving Deserialization problem of singleton class by returning already //
	 * existing object public Object readResolve() {
	 * System.out.println("Printer.readResolve()"); return INSTANCES;
	 * 
	 * }
	 */
	/*
	 * solving deserializartion problem for of singleton class by throwing the
	 * exception
	 */
	public Object readResolve() throws Exception {
		System.out.println("Printer.readResolve()");
		throw new IllegalStateException("do not want to supprot Deserialization");
	}

	// business method to display the data on the printer

	public void print(String data) {
		System.out.println(data);
	}

}
