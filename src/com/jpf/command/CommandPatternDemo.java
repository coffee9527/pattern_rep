package com.jpf.command;

import com.jpf.command.base.Broker;
import com.jpf.command.base.Stock;
import com.jpf.command.base.impl.BuyStock;
import com.jpf.command.base.impl.SellStock;

public class CommandPatternDemo {
	public static void main(String[] args) {
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	   }
}
