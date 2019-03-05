package ru.sbt.javaschool.step2.adapter;

import ru.sbt.javaschool.step2.base.Duck;
import ru.sbt.javaschool.step2.out.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
        turkey.fly();
    }
}
