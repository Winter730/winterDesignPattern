package com.winter.designPattern.abstractFactory.abstractFactoryDemo2;

import com.winter.algorithm.designPattern.abstractFactory.abstractFactoryDemo1.Department;
import com.winter.algorithm.designPattern.abstractFactory.abstractFactoryDemo1.IDepartment;
import com.winter.algorithm.designPattern.abstractFactory.abstractFactoryDemo1.IUser;
import com.winter.algorithm.designPattern.abstractFactory.abstractFactoryDemo1.User;

public class Main {
    public static void main(String[] args){
        User user = new User();
        Department department = new Department();

        IUser iu = DataAccess.CreateUser();
        iu.Insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.CreateDepartment();
        id.Insert(department);
        id.GetDepartment(1);

    }
}
