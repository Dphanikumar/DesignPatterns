package com.phani.decorator;

import com.phani.component.IceCream;

public class DryFruitIceCreamDecorator extends IceCreamDecorsator {

	public DryFruitIceCreamDecorator(IceCream cream) {
		super(cream);
	}

	@Override
	public void prepare() {

		super.prepare();
		addDryFruits();

	}

	private void addDryFruits() {
		System.out.println("Adding DryFruits");

	}

}
