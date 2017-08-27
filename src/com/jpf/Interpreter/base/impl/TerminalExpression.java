package com.jpf.Interpreter.base.impl;

import com.jpf.Interpreter.base.Expression;
/**
 * 创建Expression接口的实现类
 * @author Administrator
 *
 */
public class TerminalExpression implements Expression {
	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data)) {
			return true;
		}
		return false;
	}

}
