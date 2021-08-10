package com.winter.designPattern.iterator;

/**
 * ConcreteIterator具体迭代器类,继承Iterator
 * 实现开始、下一个、是否结尾、当前对象等方法
 */
public class ConcreteIteratorDesc extends Iterator {
    //定义了一个具体聚集对象
    private ConcreteAggreate aggreate;

    private int current = 0;

    //初始化时将具体的聚集对象传入
    public ConcreteIteratorDesc(ConcreteAggreate aggreate) {
        this.aggreate = aggreate;
        current = aggreate.getCount() - 1;
    }

    @Override
    //得到聚集的第一个对象
    public Object first() {
        return aggreate.getItems(aggreate.getCount() - 1);
    }

    @Override
    public Object next() {
        Object ret = null;
        current --;
        if(current > 0 ){
            ret = aggreate.getItems(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return aggreate.getItems(current);
    }
}
