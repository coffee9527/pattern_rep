package com.jpf.J2EE.serviceLocatorPattern;

import com.jpf.J2EE.serviceLocatorPattern.base.Service;
import com.jpf.J2EE.serviceLocatorPattern.base.ServiceLocator;

public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
	}
}
