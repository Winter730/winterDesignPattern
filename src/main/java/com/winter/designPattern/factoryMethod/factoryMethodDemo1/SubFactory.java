package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.designPattern.simpleFactory.Operation;
import com.winter.designPattern.simpleFactory.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
