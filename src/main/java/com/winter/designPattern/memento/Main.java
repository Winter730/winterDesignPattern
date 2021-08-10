package com.winter.designPattern.memento;

public class Main {
    public static void main(String[] args){
        //Originator初始状态,状态属性为on
        Originator o = new Originator();
        o.setState("ON");
        o.show();

        //保存状态时,由于有了很好的封装,可以隐藏Originator的实现细节
        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        //Originator改变了状态属性为off
        o.setState("OFF");
        o.show();

        //恢复原初始状态
        o.setMemento(c.getMemento());
        o.show();
    }
}
