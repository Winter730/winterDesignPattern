package com.winter.designPattern.factoryMethod.factoryMethodDemo2;

public class Volunteer extends LeiFeng {

    @Override
    public void sweep() {
        System.out.print("我是社区志愿者,我来");
        super.sweep();
    }

    @Override
    public void wash() {
        System.out.print("我是社区志愿者,我来");
        super.wash();
    }

    @Override
    public void buyRice() {
        System.out.print("我是社区志愿者,我来");
        super.buyRice();
    }
}
