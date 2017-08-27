package com.jpf.state.base.impl;

import com.jpf.state.base.Context;
import com.jpf.state.base.State;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}
