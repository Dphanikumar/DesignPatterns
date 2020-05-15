package com.phani.vehicle;

import com.phani.tyre.Tyre;

public class SportsCar implements Car {

	private Tyre tyre;

	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar.SportsCar()::1-param Constructor");
		this.tyre = tyre;

	}

	@Override
	public void roadTest() {
		System.out.println("Driving SportsCar car having " + tyre.info());

	}

}
