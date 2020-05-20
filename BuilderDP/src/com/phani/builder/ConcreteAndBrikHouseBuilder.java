package com.phani.builder;

import com.phani.foundation.ConcreteFoundation;
import com.phani.interior.WoodenInterior;
import com.phani.product.House;
import com.phani.roofing.ConcreteSlabRoofing;
import com.phani.structure.ConcreteAndSteelStructure;

public class ConcreteAndBrikHouseBuilder implements HouseBuilder {
	private House house;

	public ConcreteAndBrikHouseBuilder(House house) {
		System.out.println("ConcreteAndBrikHouseBuilder.ConcreteAndBrikHouseBuilder()");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new ConcreteFoundation());

	}

	@Override
	public void buildStructure() {
		house.setStructure(new ConcreteAndSteelStructure());

	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new ConcreteSlabRoofing());
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
