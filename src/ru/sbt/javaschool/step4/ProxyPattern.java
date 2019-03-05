package ru.sbt.javaschool.step4;

import ru.sbt.javaschool.step4.client.Client;
import ru.sbt.javaschool.step4.object.ProxyObject;
import ru.sbt.javaschool.step4.object.RealObject;

public class ProxyPattern {

    public static void main(String[] args) {

        Client client = null;

        if (!true) {
            client = new Client(new RealObject());
        } else  {
            client = new Client(new ProxyObject(new RealObject()));
        }
        client.invoke();
    }

}
