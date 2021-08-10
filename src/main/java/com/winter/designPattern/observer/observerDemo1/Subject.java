package com.winter.designPattern.observer.observerDemo1;

public abstract class Subject {
    private String subjetState;

    public String getSubjetState() {
        return subjetState;
    }

    public void setSubjetState(String subjetState) {
        this.subjetState = subjetState;
    }

    protected abstract void Notify();

    
}
