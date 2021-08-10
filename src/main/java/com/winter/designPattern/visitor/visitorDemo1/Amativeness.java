package com.winter.designPattern.visitor.visitorDemo1;

public class Amativeness extends Action {
    String type = "恋爱";

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + this.type + "时,凡是不懂也要装懂");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + this.type + "时,遇事懂也装作不懂");
    }
}
