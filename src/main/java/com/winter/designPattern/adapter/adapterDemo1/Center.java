package com.winter.designPattern.adapter.adapterDemo1;

public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("中锋" + name + "进攻");
    }

    @Override
    public void Defense() {
        System.out.println("中锋" + name + "防守");
    }
}
