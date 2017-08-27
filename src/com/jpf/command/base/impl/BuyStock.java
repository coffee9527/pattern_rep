package com.jpf.command.base.impl;

import com.jpf.command.base.Order;
import com.jpf.command.base.Stock;

public class BuyStock implements Order {
	private Stock abcStock;
	
	public BuyStock(Stock stock) {
		this.abcStock = stock;
	}
	
	@Override
	public void execute() {
		this.abcStock.buy();
	}

}
