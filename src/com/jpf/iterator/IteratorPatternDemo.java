package com.jpf.iterator;

import com.jpf.iterator.base.Iterator;
import com.jpf.iterator.base.impl.NameRepository;

public class IteratorPatternDemo {
	public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 
	      
	   }
}