package com.jpf.facade.base.impl;

import com.jpf.facade.base.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
