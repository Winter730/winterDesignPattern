package com.winter.designPattern.strategy;

/**
 * ConcreteStrategy 封装了具体的算法或行为,继承于Strategy
 * 具体算法A
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A实现");
    }
}
