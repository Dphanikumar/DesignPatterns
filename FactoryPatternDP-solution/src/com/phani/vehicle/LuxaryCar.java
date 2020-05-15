package com.phani.vehicle;

import com.phani.tyre.Tyre;

public class LuxaryCar implements Car {

	private Tyre tyre;

	public LuxaryCar(Tyre tyre) {
		System.out.println("LuxaryCar.LuxaryCar()::1-param Constructor");
		this.tyre = tyre;

	}

	@Override
	public void roadTest() {
		System.out.println("Driving LuxaryCar car having " + tyre.info());

	}

}
