package com.jpf.J2EE.serviceLocatorPattern.base.impl;

import com.jpf.J2EE.serviceLocatorPattern.base.Service;

public class Service1 implements Service {

	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service1");
	}

}
