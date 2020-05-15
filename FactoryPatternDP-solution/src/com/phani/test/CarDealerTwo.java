package com.phani.test;

import com.phani.factory.CarFactory;
import com.phani.tyre.MRFTyre;
import com.phani.tyre.Tyre;
import com.phani.vehicle.Car;
import com.phani.vehicle.SportsCar;

public class CarDealerTwo {

	public static void main(String[] args) {
		System.out.println("Sports car Dealer");


		Car car = null;

		// get instance

		car = CarFactory.getCarInstance("Sports");
		car.roadTest();


	}
}
