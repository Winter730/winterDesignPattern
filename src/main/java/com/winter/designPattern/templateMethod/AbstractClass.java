package com.winter.designPattern.templateMethod;

/**
 * AbstractClass是抽象类，其实也就是一抽象模板，定义并实现了一个模板方法。
 * 这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。
 *
 */
public abstract class AbstractClass {
    //一些抽象行为,放到子类去实现
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    //模板方法,给出了逻辑的骨架,而逻辑的组成是一些相应的抽象操作,它们都推迟到子类实现
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
