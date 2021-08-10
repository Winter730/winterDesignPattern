package com.winter.designPattern.builder;

public class Main {
    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        //指挥者用ConcreteBuilder1的方法来建造产品
        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.Show();

        //指挥者用ConcreteBuilder2的方法来建造产品
        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.Show();
    }
}
