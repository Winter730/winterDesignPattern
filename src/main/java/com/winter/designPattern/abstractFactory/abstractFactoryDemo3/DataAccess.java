package com.winter.designPattern.abstractFactory.abstractFactoryDemo3;

import com.winter.algorithm.designPattern.abstractFactory.abstractFactoryDemo1.IDepartment;
import com.winter.algorithm.designPattern.abstractFactory.abstractFactoryDemo1.IUser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * DataAccess类,用反射技术,取代IFactory,SqlServerFactory和AccessFactory
 */
public class DataAccess {
    private static final String AssemblyName = "com.winter.algorithm.designPattern.abstractFactory.abstractFactoryDemo1";

    //private static final String db = "SqlServer";
    private static final String db = "Access";

    public static IUser CreateUser(){
        String className = AssemblyName + "." + db + "User";
        try {
            Class clazz = Class.forName(className);
            Constructor constructor = clazz.getConstructor();
            Object object = constructor.newInstance();
            return (IUser) object;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static IDepartment CreateDepartment(){
        String className = AssemblyName + "." + db + "Department";
        try {
            Class clazz = Class.forName(className);
            Constructor constructor = clazz.getConstructor();
            Object object = constructor.newInstance();
            return (IDepartment) object;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
