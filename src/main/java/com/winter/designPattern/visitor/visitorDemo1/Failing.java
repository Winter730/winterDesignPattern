package com.winter.designPattern.visitor.visitorDemo1;

public class Failing extends Action {
    String type = "失败";

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + this.type + "时,闷头喝酒,谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + this.type + "时,眼泪汪汪,谁也劝不了");
    }
}
