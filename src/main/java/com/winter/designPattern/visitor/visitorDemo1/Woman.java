package com.winter.designPattern.visitor.visitorDemo1;

public class Woman extends Person {
    private final String  type ="女人";

    public String getType() {
        return type;
    }

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
