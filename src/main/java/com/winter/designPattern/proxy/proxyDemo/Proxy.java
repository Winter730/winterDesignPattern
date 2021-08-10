package com.winter.designPattern.proxy.proxyDemo;

public class Proxy implements GiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        gg.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
