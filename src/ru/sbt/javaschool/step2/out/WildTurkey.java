package ru.sbt.javaschool.step2.out;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Жрать-жрать!");
    }

    @Override
    public void fly() {
        System.out.println("Я летаю, но не далеко");
    }
}
