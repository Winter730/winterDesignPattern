package com.winter.designPattern.flyweight;

public class Main {
    public static void main(String[] args) {
        //代码外部状态
        int extrinsicState = 22;

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.Operation(--extrinsicState);

        Flyweight fy = f.getFlyweight("Y");
        fy.Operation(--extrinsicState);

        Flyweight fz = f.getFlyweight("Z");
        fz.Operation(--extrinsicState);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.Operation(--extrinsicState);

    }
}
