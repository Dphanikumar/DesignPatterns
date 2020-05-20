package com.phani.director;

import com.phani.builder.HouseBuilder;
import com.phani.product.House;

public class CivilEngineer {

	private HouseBuilder builder;

	public CivilEngineer(HouseBuilder builder) {
		System.out.println("CivilEngineer::1-param Constructor");
		this.builder = builder;
	}

	//defines the construction process
	public House constructHouse() {
		House house = null;
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoofing();
		builder.buildInterior();

		house = builder.buildHouse();

		return house;
	}

}
