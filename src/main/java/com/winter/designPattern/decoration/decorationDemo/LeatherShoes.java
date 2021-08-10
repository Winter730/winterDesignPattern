package com.winter.designPattern.decoration.decorationDemo;

/**
 * 具体服饰类(ConcreteDecorator)
 */
public class LeatherShoes extends Finery{
    @Override
    public void show() {
        System.out.print("皮鞋 ");
        super.show();
    }
}
