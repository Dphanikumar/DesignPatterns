package com.phani.test;

import com.phani.bike.BajajBike;
import com.phani.factory.BajajBikeFactory;
import com.phani.factory.ChennaiBajajBikeFactory;

public class SouthCustomer {
	public static void main(String[] args) {
		System.out.println("south customer");

		// creatign a bikefactory object
		BajajBikeFactory factory = null;
		factory = new ChennaiBajajBikeFactory();

		// creating the bike object
		BajajBike bike = null;
		bike = factory.manfactureBike("pulsor");
		bike.drive();
	}

}
