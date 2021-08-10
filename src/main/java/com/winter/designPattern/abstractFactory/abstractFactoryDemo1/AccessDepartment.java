package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * AccessDepartment类,用于访问Access的Department
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void Insert(Department department) {
        System.out.println("在Access中给Department表增加一条记录");
    }

    @Override
    public Department GetDepartment(int id) {
        System.out.println("在Access中根据ID得到Department表一条记录");
        return null;
    }
}
