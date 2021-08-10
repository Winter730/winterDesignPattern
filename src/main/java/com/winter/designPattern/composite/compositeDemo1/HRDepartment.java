package com.winter.designPattern.composite.compositeDemo1;

//人力资源部树叶节点
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        for(int i = 0; i < depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 员工招聘培训管理");
    }
}
