package com.winter.designPattern.bridge;

public class Main {
    public static void main(String[] args){
        Abstarction ab = new RefineAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
