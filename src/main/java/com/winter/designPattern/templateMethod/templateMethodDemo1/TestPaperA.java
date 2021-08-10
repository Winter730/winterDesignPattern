package com.winter.designPattern.templateMethod.templateMethodDemo1;

public class TestPaperA extends TestPaper {
    @Override
    protected String answer1() {
        return "a";
    }

    @Override
    protected String answer2() {
        return "a";
    }

    @Override
    protected String answer3() {
        return "a";
    }
}
