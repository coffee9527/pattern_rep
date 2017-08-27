package com.jpf.nullobj.base.extend;

import com.jpf.nullobj.base.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
