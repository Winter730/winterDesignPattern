package com.winter.designPattern.adapter.adapterDemo1;

public class Translator extends Player {
    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.attack();
    }

    @Override
    public void defense() {
        wjzf.defence();
    }
}
