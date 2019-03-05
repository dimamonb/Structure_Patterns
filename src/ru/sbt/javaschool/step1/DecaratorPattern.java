package ru.sbt.javaschool.step1;

import ru.sbt.javaschool.step1.base.Beverage;
import ru.sbt.javaschool.step1.different.beverage.Espresso;
import ru.sbt.javaschool.step1.different.beverage.Latte;
import ru.sbt.javaschool.step1.topping.Cream;
import ru.sbt.javaschool.step1.topping.Milk;


public class DecaratorPattern {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getLabel() + " $" + beverage.cost());

        Beverage beverage1 = new Latte();
        beverage1 = new Milk(new Milk(beverage1));
        beverage1 = new Milk(beverage1);
        beverage1 = new Cream(beverage1);
        System.out.println(beverage1.getLabel() + " $" + beverage1.cost());


    }

}
