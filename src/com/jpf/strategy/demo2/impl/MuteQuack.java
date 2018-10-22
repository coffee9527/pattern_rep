package com.jpf.strategy.demo2.impl;

import com.jpf.strategy.demo2.Quack;

public class MuteQuack implements Quack {
    @Override
    public void quack() {
        // do nothing
    }
}
