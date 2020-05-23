package com.phani.decorator;

import com.phani.component.IceCream;

public class HoneyIceCreamDecorator extends IceCreamDecorsator {

	public HoneyIceCreamDecorator(IceCream cream) {
		super(cream);
	}

	@Override
	public void prepare() {

		super.prepare();
		addHoney();

	}

	private void addHoney() {
System.out.println("Adding Honey");
	}

}
