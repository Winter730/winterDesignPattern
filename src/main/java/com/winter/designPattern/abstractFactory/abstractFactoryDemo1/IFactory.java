package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * IFactory接口,定义一个创建访问User表对象的抽象的工厂接口
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
