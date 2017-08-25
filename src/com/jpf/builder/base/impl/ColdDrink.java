package com.jpf.builder.base.impl;

import com.jpf.builder.base.Item;
import com.jpf.builder.base.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing pack() {
		return new Bottle();
	}

}
