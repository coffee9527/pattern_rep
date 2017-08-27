package com.jpf.strategy;

import com.jpf.strategy.base.Context;
import com.jpf.strategy.base.impl.OperationAdd;
import com.jpf.strategy.base.impl.OperationMultiply;
import com.jpf.strategy.base.impl.OperationSubstract;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
