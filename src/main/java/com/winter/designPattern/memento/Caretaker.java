package com.winter.designPattern.memento;

//管理者
public class Caretaker {
    private Memento memento;

    //得到或设置备忘录
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
