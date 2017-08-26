package com.jpf.decorator.base.impl.extend;

import com.jpf.decorator.base.Shape;
import com.jpf.decorator.base.impl.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}
