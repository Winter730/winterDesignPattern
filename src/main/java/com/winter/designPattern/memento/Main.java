package com.winter.designPattern.memento;

public class Main {
    public static void main(String[] args){
        //Originator初始状态,状态属性为on
        Originator o = new Originator();
        o.setState("ON");
        o.Show();

        //保存状态时,由于有了很好的封装,可以隐藏Originator的实现细节
        Caretaker c = new Caretaker();
        c.setMemento(o.CreateMemento());

        //Originator改变了状态属性为off
        o.setState("OFF");
        o.Show();

        //恢复原初始状态
        o.SetMemento(c.getMemento());
        o.Show();
    }
}
