package com.winter.designPattern.prototype;


public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    /**
     * 创建当前对象的浅表副本。方法是创建一个新对象,然后将当前对象的非静态字段复制到该新对象。
     * 如果字段是值类型的,则对该字段执行逐位复制。如果字段是引用类型,则复制引用但不复制引用的对象
     * 因此,原始对象及其副本引用同一对象。
     */
    @Override
    public Prototype Clone() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
