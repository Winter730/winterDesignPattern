package com.winter.designPattern.simpleFactory;

public class OperationDiv extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        try {
            if(get_numberB() == 0){
                throw new Exception("除数不能为0。");
            }
            result = get_numberA() / get_numberB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
