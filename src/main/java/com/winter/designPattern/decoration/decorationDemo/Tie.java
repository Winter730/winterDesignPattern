package com.winter.designPattern.decoration.decorationDemo;

/**
 * 具体服饰类(ConcreteDecorator)
 */
public class Tie extends Finery{
    @Override
    public void show() {
        System.out.print("领带 ");
        super.show();
    }
}
