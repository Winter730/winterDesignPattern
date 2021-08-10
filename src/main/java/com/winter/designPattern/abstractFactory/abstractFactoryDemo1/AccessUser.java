package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * AccessUser类,用于访问Access的User
 */
public class AccessUser implements IUser {
    @Override
    public void Insert(User user) {
        System.out.println("在Access中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据ID得到User表一条记录");
        return null;
    }
}
