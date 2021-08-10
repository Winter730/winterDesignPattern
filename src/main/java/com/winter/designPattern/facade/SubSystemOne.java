package com.winter.designPattern.facade;

/**
 * SubSystem Classes 子系统类集合
 * 实现子系统的功能,处理Facade对象指派的任务
 * 注意子类中没有Facade的任何信息,即没有对Facade对象的引用
 */
public class SubSystemOne {
    public void methodOne(){
        System.out.println("子系统方法一");
    }
}
