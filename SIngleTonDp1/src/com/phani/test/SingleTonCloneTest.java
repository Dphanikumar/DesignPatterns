package com.phani.test;

import com.phani.singleton.SingleTonclass;

public class SingleTonCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// creating an object for SingleTon class using getInstance()
		SingleTonclass singleTonclass = SingleTonclass.getInstance();

		// cloning already created object
		SingleTonclass singleTonclass1 = (SingleTonclass) singleTonclass.clone();

		System.out.println(singleTonclass1.hashCode() + " " + singleTonclass1.hashCode());

	}

}
