package com.jpf.facade.base.impl;

import com.jpf.facade.base.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
