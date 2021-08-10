package com.winter.designPattern.abstractFactory.abstractFactoryDemo3;


import com.winter.designPattern.abstractFactory.abstractFactoryDemo1.Department;
import com.winter.designPattern.abstractFactory.abstractFactoryDemo1.IDepartment;
import com.winter.designPattern.abstractFactory.abstractFactoryDemo1.IUser;
import com.winter.designPattern.abstractFactory.abstractFactoryDemo1.User;

public class Main {
    public static void main(String[] args){
        User user = new User();
        Department department = new Department();

        IUser iu = DataAccess.CreateUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.CreateDepartment();
        id.insert(department);
        id.getDepartment(1);

    }
}
