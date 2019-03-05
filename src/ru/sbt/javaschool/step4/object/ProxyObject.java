package ru.sbt.javaschool.step4.object;

import ru.sbt.javaschool.step4.base.IObject;

public class ProxyObject implements IObject {

    private IObject object;

    public ProxyObject(IObject object){
        this.object = object;
    }

    @Override
    public void doSomething() {
        long time1 = System.currentTimeMillis();
        object.doSomething();
        long time2 = System.currentTimeMillis();

        long result = time2 - time1;

        System.out.println("Время выполнения метода : " + result);
    }


}
