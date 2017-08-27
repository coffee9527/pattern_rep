package com.jpf.strategy.base.impl;

import com.jpf.strategy.base.Strategy;

public class OperationSubstract implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
