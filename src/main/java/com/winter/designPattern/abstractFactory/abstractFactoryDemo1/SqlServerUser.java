package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * SqlServerUser类,用于访问SQL Server的User
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据ID得到User表一条记录");
        return null;
    }
}
