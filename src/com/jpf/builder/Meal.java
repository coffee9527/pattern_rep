package com.jpf.builder;

import java.util.ArrayList;
import java.util.List;

import com.jpf.builder.base.Item;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0;
		if(items.isEmpty()) {
			return 0;
		}
		for(Item item : items) {
			cost = cost + item.price();
		}
		return cost;
	}
	
	public void showItems(){
		if(items.isEmpty()) {
			System.out.println("请添加商品");;
		}
	      for (Item item : items) {
	         System.out.print("Item : "+item.name());
	         System.out.print(", Packing : "+item.pack());
	         System.out.println(", Price : "+item.price());
	      }		
	   }	
}
