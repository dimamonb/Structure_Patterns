package ru.sbt.javaschool.step2.adapter;

import ru.sbt.javaschool.step2.base.Duck;
import ru.sbt.javaschool.step2.out.Penguin;

public class PenguinAdapter implements Duck {
    Penguin penguin;

    public PenguinAdapter(Penguin penguin) {
        this.penguin = penguin;
    }

    @Override
    public void quack() {
        penguin.gaga();
    }

    @Override
    public void fly() {
        penguin.fly();
    }
}
