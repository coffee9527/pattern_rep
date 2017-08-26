package com.jpf.proxy.base.impl;

import com.jpf.proxy.base.Image;

/**
 * 创建实现Image接口的实体类RealImage
 * 
 * @author Administrator
 *
 */
public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
