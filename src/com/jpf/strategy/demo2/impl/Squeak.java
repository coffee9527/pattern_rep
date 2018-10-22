package com.jpf.strategy.demo2.impl;

import com.jpf.strategy.demo2.Quack;

public class Squeak implements Quack {
    @Override
    public void quack() {
        System.out.println("zhi zhi jiao");
    }
}
