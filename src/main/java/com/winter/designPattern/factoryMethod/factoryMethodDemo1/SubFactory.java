package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.algorithm.designPattern.simpleFactory.Operation;
import com.winter.algorithm.designPattern.simpleFactory.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}
