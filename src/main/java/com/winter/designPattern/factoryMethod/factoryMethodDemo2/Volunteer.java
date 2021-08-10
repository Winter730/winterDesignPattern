package com.winter.designPattern.factoryMethod.factoryMethodDemo2;

public class Volunteer extends LeiFeng {

    @Override
    public void Sweep() {
        System.out.print("我是社区志愿者,我来");
        super.Sweep();
    }

    @Override
    public void Wash() {
        System.out.print("我是社区志愿者,我来");
        super.Wash();
    }

    @Override
    public void BuyRice() {
        System.out.print("我是社区志愿者,我来");
        super.BuyRice();
    }
}
