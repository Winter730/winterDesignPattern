package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * SqlServerFactory类,实现IFactory接口,实例化SqlServerUser
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
