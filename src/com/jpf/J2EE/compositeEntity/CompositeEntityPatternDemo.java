package com.jpf.J2EE.compositeEntity;

import com.jpf.J2EE.compositeEntity.base.Client;

public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}
}
