package com.jpf.J2EE.frontController;

import com.jpf.J2EE.frontController.base.FrontController;

public class FrontControllerPatternDemo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
