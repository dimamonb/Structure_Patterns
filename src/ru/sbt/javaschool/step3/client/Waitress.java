package ru.sbt.javaschool.step3.client;

import ru.sbt.javaschool.step3.component.MenuComponent;

public class Waitress {

    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void print(){
        allMenus.print();
    }

}
