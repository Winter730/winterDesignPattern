package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.designPattern.simpleFactory.Operation;
import com.winter.designPattern.simpleFactory.OperationDiv;

public class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
