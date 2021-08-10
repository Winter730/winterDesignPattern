package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.designPattern.simpleFactory.Operation;
import com.winter.designPattern.simpleFactory.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
