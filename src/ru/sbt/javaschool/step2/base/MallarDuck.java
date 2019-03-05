package ru.sbt.javaschool.step2.base;

public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Кря-кря");
    }

    @Override
    public void fly() {
        System.out.println("Я парю");
    }
}
