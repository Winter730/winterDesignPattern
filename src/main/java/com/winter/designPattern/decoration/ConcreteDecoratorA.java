package com.winter.designPattern.decoration;

/**
 * ConcreteDecoration就是具体的装饰对象,起到了给Component添加职责的功能
 */
public class ConcreteDecoratorA extends Decorator{
    //本类的独有功能,以区别于ConcreteDecoratorB
    private String addState;

    @Override
    public void Operation() {
        //首先运行原Component的Operation()，再执行本类的功能,如addedState,相当于对原Component进行了装饰
        super.Operation();
        addState = "New State";
        System.out.println("具体装饰对象A的操作");
    }

}
