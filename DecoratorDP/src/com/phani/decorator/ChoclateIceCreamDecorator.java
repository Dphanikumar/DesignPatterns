package com.phani.decorator;

import com.phani.component.IceCream;

public class ChoclateIceCreamDecorator extends IceCreamDecorsator {

	public ChoclateIceCreamDecorator(IceCream cream) {
		super(cream);
	}

	@Override
	public void prepare() {

		super.prepare();
		addChoclate();

	}

	private void addChoclate() {
		System.out.println("Adding Choclate");

	}

}
