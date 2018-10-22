package com.jpf.strategy.demo2;

public class RedDuck extends Duck{
    public RedDuck(Fly fly, Quack quack) {
        super(fly, quack);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void dispaly() {
        System.out.println("i am red duck");
    }
}
