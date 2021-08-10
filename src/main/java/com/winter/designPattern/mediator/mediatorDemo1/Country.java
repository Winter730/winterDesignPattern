package com.winter.designPattern.mediator.mediatorDemo1;

/**
 * 国家
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
