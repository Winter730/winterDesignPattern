package com.winter.designPattern.factoryMethod.factoryMethodDemo1;

import com.winter.algorithm.designPattern.simpleFactory.Operation;
import com.winter.algorithm.designPattern.simpleFactory.OperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }

}
