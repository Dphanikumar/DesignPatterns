package com.phani.factory;

import com.phani.bike.BajajBike;
import com.phani.bike.BajajDiscover;
import com.phani.bike.BajajPlatina;
import com.phani.bike.BajajPulsor;

public class NagpurBajajBikeFactory {

	public static void paint() {
		System.out.println("Painting Bike ");
	}

	public static void assemble() {

		System.out.println("Assembling the bike");
	}

	public static void roadTest() {

		System.out.println("roadtesting the bike");
	}

	public static BajajBike buildBike(String model) {

		BajajBike bike = null;

		if (model.equalsIgnoreCase("pulsor")) {
			bike = new BajajPulsor();
			System.out.println("creating Pulsor bike");
		} else if (model.equalsIgnoreCase("discover")) {
			bike = new BajajDiscover();
			System.out.println("creating discover bike");

		} else if (model.equalsIgnoreCase("platina")) {
			bike = new BajajPlatina();
			System.out.println("creating platina bike");

		} else
			throw new IllegalArgumentException("Invalid bike");

		assemble();
		paint();
		roadTest();

		return bike;

	}

}
