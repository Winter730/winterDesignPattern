package com.winter.designPattern.interpreter;



/**
 * AbstractExpression(抽象表达式),声明一个抽象的解释操作
 * 这个接口为抽象语法树中所有的结果所共享
 */
public abstract class AbstractExpression{
    public abstract void interpret(Context context);
}
