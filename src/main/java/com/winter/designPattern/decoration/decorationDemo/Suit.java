package com.winter.designPattern.decoration.decorationDemo;

/**
 * 具体服饰类(ConcreteDecorator)
 */
public class Suit extends Finery{
    @Override
    public void show() {
        System.out.print("西装 ");
        super.show();
    }
}
