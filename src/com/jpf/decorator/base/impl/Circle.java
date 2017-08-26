package com.jpf.decorator.base.impl;

import com.jpf.decorator.base.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}

}
