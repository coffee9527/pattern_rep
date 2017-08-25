package com.jpf.builder.base.domain;

import com.jpf.builder.base.impl.ColdDrink;

public class Coffee extends ColdDrink {

	@Override
	public String name() {
		return "coffee";
	}

	@Override
	public float price() {
		return 25;
	}

}
