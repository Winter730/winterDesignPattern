package com.winter.designPattern.iterator;

public class Main {
    public static void main(String[] args){
        ConcreteAggreate a = new ConcreteAggreate();

        a.setItems(0, "spring");
        a.setItems(1, "winter");
        a.setItems(2 , "summer");
        a.setItems(3, "autumn");
        a.setItems(4, "java");
        a.setItems(5, "python");

        //Iterator i = new ConcreteIterator(a);
        Iterator i = new ConcreteIteratorDesc(a);
        while (!i.IsDone()) {
            System.out.println(i.CurrentItem() + "请买车票");
            i.Next();
        }

    }
}
