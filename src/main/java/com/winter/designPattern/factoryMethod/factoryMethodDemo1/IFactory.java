package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.algorithm.designPattern.simpleFactory.Operation;

/**
 * 工厂接口
 */
public interface IFactory {
    Operation CreateOperation();
}
