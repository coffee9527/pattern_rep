package com.jpf.decorator.base.impl;

import com.jpf.decorator.base.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}

}
