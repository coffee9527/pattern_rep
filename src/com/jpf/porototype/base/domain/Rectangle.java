package com.jpf.porototype.base.domain;

import com.jpf.porototype.base.Shape;

public class Rectangle extends Shape {
	
	public Rectangle(){
	     type = "Rectangle";
	   }
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
