package com.winter.designPattern.visitor.visitorDemo1;

public class Man extends Person {
    private final String  type ="男人";

    public String getType() {
        return type;
    }

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
