package com.jpf.facade;

import com.jpf.facade.base.ShapeMaker;

public class FacadePatternDemo {
	public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
}
