package com.phani.test;

import com.phani.component.ButtorScotchIceCream;
import com.phani.component.IceCream;
import com.phani.decorator.ChoclateIceCreamDecorator;
import com.phani.decorator.HoneyIceCreamDecorator;

public class Customer2 {

	public static void main(String[] args) {
		IceCream cream = null;
		cream = new ChoclateIceCreamDecorator(new HoneyIceCreamDecorator(new ButtorScotchIceCream()));
		cream.prepare();
	}

}
