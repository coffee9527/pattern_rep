package com.jpf.builder.base.domain;

import com.jpf.builder.base.impl.ColdDrink;

public class Tea extends ColdDrink {

	@Override
	public String name() {
		return "tea";
	}

	@Override
	public float price() {
		return 30;
	}

}
