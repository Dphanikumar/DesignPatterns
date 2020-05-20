package com.phani.test;

import com.phani.factory.HouseFactory;
import com.phani.product.House;

public class BuilderDpTest {

	public static void main(String[] args) {
		House house=null;
		
		System.out.println("BuilderDpTest.main()");
		//get Product 
		house=HouseFactory.getHouseInstance("stone");
		System.out.println(house);
		
		
		

	}

}
