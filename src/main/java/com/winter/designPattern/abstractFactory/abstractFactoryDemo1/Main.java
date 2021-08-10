package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

public class Main {
    public static void main(String[] args){
        User user = new User();
        //IFactory factory = new SqlServerFactory();
        IFactory factory = new AccessFactory();
        IUser iu = factory.CreateUser();

        iu.Insert(user);
        iu.getUser(1);
    }
}
