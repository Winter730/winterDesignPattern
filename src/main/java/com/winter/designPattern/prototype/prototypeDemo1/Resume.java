package com.winter.designPattern.prototype.prototypeDemo1;

/**
 * 深复制实现
 */
public class Resume implements Cloneable {
    private String name;

    private String sex;

    private String age;

    private String timeArea;

    private String company;

    public Resume(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea, String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public void Display(){
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历:" + timeArea + " " + company);
    }

    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
