package com.jpf.builder.base.impl;

import com.jpf.builder.base.Item;
import com.jpf.builder.base.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing pack() {
		return new Wrapper();
	}

}
