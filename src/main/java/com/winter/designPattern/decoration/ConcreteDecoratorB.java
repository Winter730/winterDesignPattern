package com.winter.designPattern.decoration;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    //本类独有的方法,以区别于ConcreteDecoratorA
    private void addedBehavior(){

    }
}
