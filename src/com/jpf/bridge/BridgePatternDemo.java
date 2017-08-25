package com.jpf.bridge;

import com.jpf.bridge.base.Shape;
import com.jpf.bridge.base.impl.Circle;
import com.jpf.bridge.base.impl.GreenCircle;
import com.jpf.bridge.base.impl.RedCircle;

public class BridgePatternDemo {
	public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
}
