package com.jpf.builder.base.domain;

import com.jpf.builder.base.impl.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "chicken burger";
	}

	@Override
	public float price() {
		return 20;
	}

}
