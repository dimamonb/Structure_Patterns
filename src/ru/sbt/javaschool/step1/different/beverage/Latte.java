package ru.sbt.javaschool.step1.different.beverage;

import ru.sbt.javaschool.step1.base.Beverage;

public class Latte extends Beverage {

    public Latte(){
        label = "Latte";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
