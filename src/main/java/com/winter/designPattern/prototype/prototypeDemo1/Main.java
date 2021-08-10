package com.winter.designPattern.prototype.prototypeDemo1;

public class Main {
    public static void main(String[] args){
        //深拷贝
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xx公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006", "YY企业");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男","24");

        a.Display();
        b.Display();
        c.Display();
    }
}
