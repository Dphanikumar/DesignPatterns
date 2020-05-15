package com.phani.test;

import com.phani.factory.CarFactory;
import com.phani.tyre.MechallineTyre;
import com.phani.tyre.Tyre;
import com.phani.vehicle.Car;
import com.phani.vehicle.LuxaryCar;

public class CarDealerOne {

	public static void main(String[] args) {
		System.out.println("Luxary car Dealer");


		Car car = null;

		// get instance

		car = CarFactory.getCarInstance("Luxary");
		car.roadTest();


	}

}
