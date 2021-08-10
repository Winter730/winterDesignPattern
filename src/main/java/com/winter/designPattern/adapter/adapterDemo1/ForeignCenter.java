package com.winter.designPattern.adapter.adapterDemo1;

public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("外籍中锋" + name + "进攻");
    }

    public void defence(){
        System.out.println("外籍中锋" + name + "防守");
    }
}
