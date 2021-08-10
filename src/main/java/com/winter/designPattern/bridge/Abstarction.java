package com.winter.designPattern.bridge;

public abstract class Abstarction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void Operation(){
        implementor.Operation();
    }
}
