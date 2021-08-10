package com.winter.designPattern.visitor.visitorDemo1;

public class Success extends Action {
    String type = "成功";
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + this.type + "时,背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + this.type + "时,背后大多有一个不成功的男人");
    }
}
