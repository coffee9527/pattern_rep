package com.jpf.bridge.base.impl;

import com.jpf.bridge.base.DrawAPI;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}
	
}
