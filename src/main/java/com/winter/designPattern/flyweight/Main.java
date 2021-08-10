package com.winter.designPattern.flyweight;

public class Main {
    public static void main(String[] args) {
        //代码外部状态
        int extrinsicState = 22;

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicState);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicState);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicState);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);

    }
}
