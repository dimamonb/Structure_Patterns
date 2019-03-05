package ru.sbt.javaschool.step1.topping;

import ru.sbt.javaschool.step1.base.AbstractDecorator;
import ru.sbt.javaschool.step1.base.Beverage;

public class Milk extends AbstractDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getLabel() {
        return beverage.getLabel() + ", milk";
    }
}
