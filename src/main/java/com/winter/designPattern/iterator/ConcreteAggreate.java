package com.winter.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类,继承Aggregate
 */
public class ConcreteAggreate extends Aggregate {
    //声明一个List泛型变量，用于存放聚合对象
    private List<Object> items = new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount(){
        return items.size();
    }

    public Object getItems(int i) {
        return items.get(i);
    }

    public void setItems(int i,Object value) {
        items.add(i, value);
    }
}

