package com.phani.builder;

import com.phani.product.House;

public interface HouseBuilder {
	
	void buildBasement();
	void buildStructure();
	void buildRoofing();
	void buildInterior();
	House buildHouse();
	

}
