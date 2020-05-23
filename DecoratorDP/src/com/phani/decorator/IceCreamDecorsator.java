package com.phani.decorator;

import com.phani.component.IceCream;

public abstract class IceCreamDecorsator implements IceCream {

	private IceCream iceCream;

	public IceCreamDecorsator(IceCream cream) {
		super();
		this.iceCream = cream;
	}

	@Override
	public void prepare() {

		iceCream.prepare();

	}

}
