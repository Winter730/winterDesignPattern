package com.winter.designPattern.templateMethod.templateMethodDemo1;

public class TestPaperB extends TestPaper {
    @Override
    protected String answer1() {
        return "b";
    }

    @Override
    protected String answer2() {
        return "b";
    }

    @Override
    protected String answer3() {
        return "b";
    }
}
