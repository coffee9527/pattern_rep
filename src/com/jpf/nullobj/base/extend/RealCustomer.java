package com.jpf.nullobj.base.extend;

import com.jpf.nullobj.base.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
