package ru.sbt.javaschool.step4.object;

import ru.sbt.javaschool.step4.base.IObject;

public class RealObject implements IObject {
    @Override
    public void doSomething() {
        System.out.println("i do smth everytime");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
