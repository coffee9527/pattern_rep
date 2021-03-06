package com.jpf.observer.base;

import java.util.ArrayList;
import java.util.List;


/**
 * Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法。
 * 
 * @author Administrator
 *
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
