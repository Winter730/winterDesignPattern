package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * IUser接口,用于客户端访问,接触与具体数据库访问的耦合
 */
public interface IUser {
    void insert(User user);

    User getUser(int id);
}
