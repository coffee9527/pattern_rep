package com.jpf.porototype.base.domain;

import com.jpf.porototype.base.Shape;

public class Square extends Shape {
	
	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
