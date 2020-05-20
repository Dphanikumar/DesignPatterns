package com.phani.builder;

import com.phani.foundation.WoodenFoundation;
import com.phani.interior.WoodenInterior;
import com.phani.product.House;
import com.phani.roofing.WoodenRooofing;
import com.phani.structure.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {
	private House house;

	public WoodenHouseBuilder(House house) {
		System.out.println("Wooden.ConcreteAndBrikHouseBuilder()");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new WoodenFoundation());

	}

	@Override
	public void buildStructure() {
		house.setStructure(new WoodenStructure());

	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new WoodenRooofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new WoodenInterior());

	}

	@Override
	public House buildHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
