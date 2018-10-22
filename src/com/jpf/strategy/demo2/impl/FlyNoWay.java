package com.jpf.strategy.demo2.impl;

import com.jpf.strategy.demo2.Fly;

public class FlyNoWay implements Fly {
    @Override
    public void fly() {
        System.out.println("i can not fly");
    }
}
