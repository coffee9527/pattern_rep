package com.jpf.strategy.demo2;

public abstract  class Duck implements Fly, Quack{
    private Fly fly;
    private Quack quack;

    public Duck(Fly fly, Quack quack) {
        this.fly = fly;
        this.quack = quack;
    }


    @Override
    public void fly() {
        fly.fly();
    }

    @Override
    public void quack() {
        quack.quack();
    }

    public abstract void dispaly();
}
