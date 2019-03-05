package ru.sbt.javaschool.step1.different.beverage;

import ru.sbt.javaschool.step1.base.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        label = "Espresso";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
