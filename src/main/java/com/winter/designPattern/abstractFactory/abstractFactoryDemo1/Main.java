package com.winter.designPattern.abstractFactory.abstractFactoryDemo1;

public class Main {
    public static void main(String[] args){
        User user = new User();
        //IFactory factory = new SqlServerFactory();
        IFactory factory = new AccessFactory();
        IUser iu = factory.createUser();

        iu.insert(user);
        iu.getUser(1);
    }
}
