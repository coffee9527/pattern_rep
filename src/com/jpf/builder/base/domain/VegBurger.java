package com.jpf.builder.base.domain;

import com.jpf.builder.base.impl.Burger;

public class VegBurger extends Burger {

	@Override
	public float price() {
		return 15;
	}

	@Override
	public String name() {
		return "vag burger";
	}

}
