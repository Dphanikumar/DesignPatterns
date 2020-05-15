package com.phani.test;

import com.phani.bike.BajajBike;
import com.phani.factory.BajajBikeFactory;
import com.phani.factory.NagpurBajajBikeFactory;

public class NorthCustomer {
	public static void main(String[] args) {

		System.out.println("North customer");

		// creatign a bikefactory object
		BajajBikeFactory factory = null;
		factory = new NagpurBajajBikeFactory();

		// creating the bike object
		BajajBike bike = null;
		bike = factory.manfactureBike("pulsor");
		bike.drive();

	}

}
