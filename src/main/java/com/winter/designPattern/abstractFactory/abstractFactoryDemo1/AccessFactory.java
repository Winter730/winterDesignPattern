package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * AccessFactory类,实现IFactory接口,实例化AccessUser
 */
public class AccessFactory implements IFactory{
    @Override
    public IUser CreateUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new AccessDepartment();
    }
}
