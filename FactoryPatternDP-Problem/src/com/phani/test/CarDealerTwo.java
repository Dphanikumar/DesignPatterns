package com.phani.test;

import com.phani.tyre.MRFTyre;
import com.phani.tyre.Tyre;
import com.phani.vehicle.Car;
import com.phani.vehicle.SportsCar;

public class CarDealerTwo {

	public static void main(String[] args) {
		System.out.println("Sports car Dealer");

		Tyre tyre = null;
		Car car = null;

		tyre = new MRFTyre();
		car = new SportsCar(tyre);
		car.roadTest();

	}
}