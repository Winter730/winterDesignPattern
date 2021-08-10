package com.winter.designPattern.factoryMethod.factoryMethodDemo2;

/**
 * 学雷锋的大学生工厂
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
