package com.phani.test;

import com.phani.tyre.AppoloTyre;
import com.phani.tyre.Tyre;
import com.phani.vehicle.Car;
import com.phani.vehicle.StandardCar;

public class CarDealer3 {

	public static void main(String[] args) {
		System.out.println("Budjet car Dealer");

		Tyre tyre = null;
		Car car = null;

		tyre = new AppoloTyre();
		car = new StandardCar(tyre);
		car.roadTest();

	}

}
