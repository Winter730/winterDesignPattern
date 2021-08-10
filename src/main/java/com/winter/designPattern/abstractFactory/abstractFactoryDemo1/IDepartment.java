package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * IDepartment接口,用于客户端访问,解除与具体数据库访问的耦合
 */
public interface IDepartment {
    void Insert(Department department);

    Department GetDepartment(int id);
}
