package com.jpf.observer.base;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
