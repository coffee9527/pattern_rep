package com.jpf.command.base.impl;

import com.jpf.command.base.Order;
import com.jpf.command.base.Stock;

public class SellStock implements Order {
	private Stock abcStock;
	public SellStock(Stock stock) {
		this.abcStock = stock;
	}
	@Override
	public void execute() {
		this.abcStock.sell();
	}

}
