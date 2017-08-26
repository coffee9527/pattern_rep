package com.jpf.chain.base.extend;

import com.jpf.chain.base.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
	
	public ErrorLogger(int level){
	      this.level = level;
	   }

	
	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}

}
