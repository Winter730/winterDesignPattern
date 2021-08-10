package com.winter.designPattern.decoration.decorationDemo;

/**
 * 具体服饰类(ConcreteDecorator)
 */
public class TShirts extends Finery{
    @Override
    public void show() {
        System.out.print("大T恤 ");
        super.show();
    }
}
