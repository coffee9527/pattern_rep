package com.jpf.chain.base.extend;

import com.jpf.chain.base.AbstractLogger;
/**
 * 创建扩展了该记录器类的实体类
 * @author Administrator
 *
 */
public class ConsoleLogger extends AbstractLogger {
	public ConsoleLogger(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}

}
