package com.winter.designPattern.flyweight.flyweightDemo2;

public abstract class WebSite {
    //"使用"方法需要传递"用户"对象
    public abstract void use(User user);
}
