package com.winter.designPattern.memento.mementoDemo2;

public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
