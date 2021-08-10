package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * SqlServerFactory类,实现IFactory接口,实例化SqlServerUser
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new SqlServerDepartment();
    }
}
