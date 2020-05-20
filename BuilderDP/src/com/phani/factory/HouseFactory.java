package com.phani.factory;

import com.phani.builder.ConcreteAndBrikHouseBuilder;
import com.phani.builder.HouseBuilder;
import com.phani.builder.MarbleHouseBuilder;
import com.phani.builder.WoodenHouseBuilder;
import com.phani.builder.iglooHouseBuilder;
import com.phani.director.CivilEngineer;
import com.phani.product.House;

public class HouseFactory {

	public static House getHouseInstance(String houseType) {
		HouseBuilder builder = null;
		CivilEngineer civilEngineer = null;
		House house = null;
		if (houseType.equalsIgnoreCase("concretehouse")) {
			builder = new ConcreteAndBrikHouseBuilder(new House());

		} else if (houseType.equalsIgnoreCase("Wooden")) {
			builder = new WoodenHouseBuilder(new House());

		} else if (houseType.equalsIgnoreCase("igloo")) {
			builder = new iglooHouseBuilder(new House());

		} else if (houseType.equalsIgnoreCase("stone")) {
			builder = new MarbleHouseBuilder(new House());

		} else
			throw new IllegalArgumentException("Invalid House Type");
		civilEngineer = new CivilEngineer(builder);
		house = civilEngineer.constructHouse();
		return house;

	}

}
