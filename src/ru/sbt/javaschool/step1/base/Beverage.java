package ru.sbt.javaschool.step1.base;

public abstract class Beverage {

    protected String label = "Выбран классический напиток";

    protected int cost = 99;

    public abstract double cost();

    public String getLabel(){
        return label;
    }

}
