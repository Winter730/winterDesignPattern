package com.winter.designPattern.decoration.decorationDemo;

/**
 * 具体服饰类(ConcreteDecorator)
 */
public class Sneakers extends Finery{
    @Override
    public void show() {
        System.out.print("破球鞋 ");
        super.show();
    }
}
