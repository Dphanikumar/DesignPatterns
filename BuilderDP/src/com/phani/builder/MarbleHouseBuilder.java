package com.phani.builder;

import com.phani.foundation.IceFoundation;
import com.phani.foundation.StoneFoundation;
import com.phani.interior.IceInterior;
import com.phani.interior.MarbleAndGraniteInterior;
import com.phani.product.House;
import com.phani.roofing.IceRoofing;
import com.phani.roofing.SandStoneRoofing;
import com.phani.structure.IceStructure;
import com.phani.structure.TallStoneStructure;

public class MarbleHouseBuilder implements HouseBuilder {
	private House house;

	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder.ConcreteAndBrikHouseBuilder()");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new StoneFoundation());

	}

	@Override
	public void buildStructure() {
		house.setStructure(new TallStoneStructure());

	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new SandStoneRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new MarbleAndGraniteInterior());

	}

	@Override
	public House buildHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
