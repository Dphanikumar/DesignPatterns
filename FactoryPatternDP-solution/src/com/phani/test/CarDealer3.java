package com.phani.test;

import com.phani.factory.CarFactory;
import com.phani.vehicle.Car;

public class CarDealer3 {

	public static void main(String[] args) {
		System.out.println("Budjet car Dealer");

		Car car = null;

		// get instance

		car = CarFactory.getCarInstance("Standard");
		car.roadTest();

	}

}
