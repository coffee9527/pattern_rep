package com.jpf.template;

import com.jpf.template.base.Game;
import com.jpf.template.base.extend.Cricket;
import com.jpf.template.base.extend.Football;

public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
