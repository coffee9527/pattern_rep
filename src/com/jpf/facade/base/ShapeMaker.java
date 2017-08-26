package com.jpf.facade.base;

import com.jpf.facade.base.impl.Circle;
import com.jpf.facade.base.impl.Rectangle;
import com.jpf.facade.base.impl.Square;

/**
 * 创建一个外观类
 * 
 * @author Administrator
 *
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
