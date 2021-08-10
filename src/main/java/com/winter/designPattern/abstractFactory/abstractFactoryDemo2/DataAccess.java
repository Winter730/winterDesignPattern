package com.winter.designPattern.abstractFactory.abstractFactoryDemo2;


import com.winter.designPattern.abstractFactory.abstractFactoryDemo1.*;

/**
 * 去除IFactory、SqlServerFactory和AccessFactory三个工厂类
 * 取而代之DataAccess类,用简单工厂模式来实现
 */
public class DataAccess {
    //private static final String db  = "SqlServer";
    private static final String db  = "Access";

    public static IUser createUser(){
        IUser result = null;
        switch (db)
        {
            case "SqlServer":
                result = new SqlServerUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
        }
        return result;
    }

    public static IDepartment createDepartment(){
        IDepartment result = null;
        switch (db)
        {
            case "SqlServer":
                result = new SqlServerDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }
}
