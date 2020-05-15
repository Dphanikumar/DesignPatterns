package com.phani.factory;

import com.phani.tyre.AppoloTyre;
import com.phani.tyre.MRFTyre;
import com.phani.tyre.MechallineTyre;
import com.phani.tyre.Tyre;
import com.phani.vehicle.Car;
import com.phani.vehicle.LuxaryCar;
import com.phani.vehicle.SportsCar;
import com.phani.vehicle.StandardCar;

public class CarFactory {

	// static factory method having factory pattern logic
	public static Car getCarInstance(String carType) {

		Car car = null;
		Tyre tyre = null;
		if (carType.equalsIgnoreCase(CarType.TYPE_STANDARD)) {
			tyre = new AppoloTyre();
			car = new StandardCar(tyre);

		}

		else if (carType.equalsIgnoreCase(CarType.TYPE_LUXARY)) {
			tyre = new MechallineTyre();
			car = new LuxaryCar(tyre);

		} else if (carType.equalsIgnoreCase(CarType.TYPE_SPORTS)) {
			tyre = new MRFTyre();
			car = new SportsCar(tyre);

		} else
			throw new IllegalStateException("Car type is not valid");

		return car;

	}

}
