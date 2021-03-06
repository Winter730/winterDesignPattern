package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

/**
 * SqlServerDepartment类,用于访问SQL Server的Department
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中给Department表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL Server中根据ID得到Department表一条记录");
        return null;
    }
}
