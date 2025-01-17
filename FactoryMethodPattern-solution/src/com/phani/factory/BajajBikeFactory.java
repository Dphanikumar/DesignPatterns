package com.phani.factory;

import com.phani.bike.BajajBike;

public abstract class BajajBikeFactory {

	public abstract void paint();

	public abstract void assemble();

	public abstract void oiling();

	public abstract void roadTest();

	public abstract BajajBike buildBike(String model);

	public BajajBike manfactureBike(String model) {
		BajajBike bike = null;
		bike = buildBike(model);
		paint();
		assemble();
		roadTest();
		oiling();

		return bike;

	}

}
