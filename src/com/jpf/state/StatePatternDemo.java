package com.jpf.state;

import com.jpf.state.base.Context;
import com.jpf.state.base.impl.StartState;
import com.jpf.state.base.impl.StopState;

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}
