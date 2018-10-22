package com.jpf.strategy.demo2;

import com.jpf.strategy.demo2.impl.FlyWithSwing;
import com.jpf.strategy.demo2.impl.Quack;

public class MainClass {
    public static void main(String[] args) {
        Fly fly = new FlyWithSwing();
        Quack quack = new Quack();
        //把可变的行为变成接口
        Duck duck = new RedDuck(fly, quack);
        duck.dispaly();
        duck.fly();
        duck.quack();
    }
}
