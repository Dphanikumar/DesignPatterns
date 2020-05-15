package com.phani.vehicle;

import com.phani.tyre.Tyre;

public class StandardCar implements Car {

	private Tyre tyre;

	public StandardCar(Tyre tyre) {
		System.out.println("StandardCar.StandardCar()::1-param Constructor");
		this.tyre = tyre;

	}

	@Override
	public void roadTest() {
		System.out.println("Driving standard car having " + tyre.info());

	}

}