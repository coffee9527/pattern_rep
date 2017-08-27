package com.jpf.memento.base;
/**
 * Originator 创建并在 Memento 对象中存储状态
 * @author Administrator
 *
 */
public class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento Memento) {
		state = Memento.getState();
	}
}
