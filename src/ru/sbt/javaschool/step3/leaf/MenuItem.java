package ru.sbt.javaschool.step3.leaf;

import ru.sbt.javaschool.step3.component.MenuComponent;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vegeterian;
    private double price;


    public MenuItem(String name,
                    String description,
                    boolean vegeterian,
                    double price){
        this.description = description;
        this.name = name;
        this.price = price;
        this.vegeterian = vegeterian;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(){
        System.out.print("  " + getName());
        if (isVegeterian()){
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     ---  "+ getDescription());
    }
}
