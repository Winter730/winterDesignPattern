package com.winter.designPattern.singleton;

/**
 * 多线程时的单例
 */
public class Singleton2 {
    private static Singleton2 instance;

    //程序运行时创建一个静态只读的进程辅助对象
    private static final Object syncRoot = new Object();

    public Singleton2() {
    }

    public static Singleton2 getInstance(){
        //在同一时刻加了锁的那部分程序只有一个线程可以进入
        synchronized (syncRoot) {
            if(instance == null) {
                instance = new Singleton2();
            }
        }
        return instance;
    }
}
