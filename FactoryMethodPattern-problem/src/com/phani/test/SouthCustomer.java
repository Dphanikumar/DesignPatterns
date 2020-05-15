package com.phani.test;

import com.phani.bike.BajajBike;
import com.phani.factory.ChennaiBajajBikeFactory;

public class SouthCustomer {
	public static void main(String[] args) {

		BajajBike bike = null;
		// get Bike
		bike = ChennaiBajajBikeFactory.buildBike("pulsor");
		bike.drive();

	}

}
