package com.jpf.observer;

import com.jpf.observer.base.Subject;
import com.jpf.observer.base.impl.BinaryObserver;
import com.jpf.observer.base.impl.HexaObserver;
import com.jpf.observer.base.impl.OctalObserver;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(21);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
