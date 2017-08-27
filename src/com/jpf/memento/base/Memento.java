package com.jpf.memento.base;
/**
 * Memento 包含了要被恢复的对象的状态
 * @author Administrator
 *
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
