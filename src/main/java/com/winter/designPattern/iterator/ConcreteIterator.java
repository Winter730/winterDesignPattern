package com.winter.designPattern.iterator;

/**
 * ConcreteIterator具体迭代器类,继承Iterator
 */
public class ConcreteIterator extends Iterator {
    //定义了一个具体聚集对象
    private ConcreteAggreate aggreate;

    private int current = 0;

    //初始化时将具体的聚集对象传入
    public ConcreteIterator(ConcreteAggreate aggreate) {
        this.aggreate = aggreate;
    }

    @Override
    //得到聚集的第一个对象
    public Object First() {
        return aggreate.getItems(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current ++;
        if(current < aggreate.getCount()){
            ret = aggreate.getItems(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        return current >= aggreate.getCount();
    }

    @Override
    public Object CurrentItem() {
        return aggreate.getItems(current);
    }
}
