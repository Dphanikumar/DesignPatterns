package com.phani.builder;

import com.phani.foundation.IceFoundation;
import com.phani.interior.IceInterior;
import com.phani.product.House;
import com.phani.roofing.IceRoofing;
import com.phani.structure.IceStructure;

public class iglooHouseBuilder implements HouseBuilder {
	private House house;

	public iglooHouseBuilder(House house) {
		System.out.println("iglooHouseBuilder.ConcreteAndBrikHouseBuilder()");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new IceFoundation());

	}

	@Override
	public void buildStructure() {
		house.setStructure(new IceStructure());

	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new IceRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new IceInterior());

	}

	@Override
	public House buildHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
