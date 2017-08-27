package com.jpf.visitor.base.impl;

import com.jpf.visitor.base.ComputerPart;
import com.jpf.visitor.base.ComputerPartVisitor;

public class Computer implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
