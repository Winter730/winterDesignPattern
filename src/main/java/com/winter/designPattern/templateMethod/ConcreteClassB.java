package com.winter.designPattern.templateMethod;

/**
 * ConcreteClass实现父类所定义的一个或多个抽象方法。
 * 每一个AbstractClass都可以有任意多个ConcreteClass与之对应,而每一个ConcreteClass都可以给出这些抽象方法的不同实现
 * 从而使得顶级逻辑的实现各不相同。
 *
 * 实现PrimitiveOperation以完成算法中与特定子类相关的步骤
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
