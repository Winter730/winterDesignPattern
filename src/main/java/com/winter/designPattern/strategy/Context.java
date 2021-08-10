package com.winter.designPattern.strategy;

/**
 * Context,用一个ConcreteStrategy来配置,维护一个对Strategy对象的引用
 */
public class Context {
    Strategy strategy;

    //初始化时,传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    //根据具体的策略对象,调用其算法的方法
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();

    }



}
