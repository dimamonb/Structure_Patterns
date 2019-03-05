package ru.sbt.javaschool.step4.client;

import ru.sbt.javaschool.step4.base.IObject;

public class Client {

    IObject object;

    public Client(IObject object){
        this.object = object;
    }

    public void invoke(){
        object.doSomething();
    }

}
