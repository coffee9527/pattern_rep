package com.jpf.state.base.impl;

import com.jpf.state.base.Context;
import com.jpf.state.base.State;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}

}
