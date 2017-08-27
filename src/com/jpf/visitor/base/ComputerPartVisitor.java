package com.jpf.visitor.base;

import com.jpf.visitor.base.impl.Computer;
import com.jpf.visitor.base.impl.Keyboard;
import com.jpf.visitor.base.impl.Monitor;
import com.jpf.visitor.base.impl.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
