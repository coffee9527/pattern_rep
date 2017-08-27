package com.jpf.visitor;

import com.jpf.visitor.base.ComputerPart;
import com.jpf.visitor.base.impl.Computer;
import com.jpf.visitor.base.impl.ComputerPartDisplayVisitor;
import com.jpf.visitor.base.impl.Keyboard;
import com.jpf.visitor.base.impl.Monitor;
import com.jpf.visitor.base.impl.Mouse;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		
		ComputerPart keyboard = new Keyboard();
		keyboard.accept(new ComputerPartDisplayVisitor());
		
		ComputerPart monitor = new Monitor();
		monitor.accept(new ComputerPartDisplayVisitor());
		
		ComputerPart mouse = new Mouse();
		mouse.accept(new ComputerPartDisplayVisitor());
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
