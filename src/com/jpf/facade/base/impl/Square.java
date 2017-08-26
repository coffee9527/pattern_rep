package com.jpf.facade.base.impl;

import com.jpf.facade.base.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
