package com.winter.designPattern.singleton;

/**
 * 多线程时的单例---双重锁定
 */
public class Singleton3 {
    private static Singleton3 instance;

    //程序运行时创建一个静态只读的进程辅助对象
    private static final Object syncRoot = new Object();

    public Singleton3() {
    }

    public static Singleton3 getInstance(){
        //先判断实例是否存在,不存在再加锁处理
        if(instance == null){
            synchronized (syncRoot) {
                if(instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
