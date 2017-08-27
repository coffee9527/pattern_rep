package com.jpf.J2EE.serviceLocatorPattern.base.impl;

import com.jpf.J2EE.serviceLocatorPattern.base.Service;

public class Service2 implements Service {

	@Override
	public String getName() {
		return "Service2";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service2");
	}

}
