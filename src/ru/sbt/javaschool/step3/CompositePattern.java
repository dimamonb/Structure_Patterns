package ru.sbt.javaschool.step3;

import ru.sbt.javaschool.step3.client.Waitress;
import ru.sbt.javaschool.step3.component.MenuComponent;
import ru.sbt.javaschool.step3.composite.Menu;
import ru.sbt.javaschool.step3.leaf.MenuItem;

public class CompositePattern {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "breakfast");
        MenuComponent dinerMenu = new Menu("Diner menu", "lunch");
        MenuComponent cafeMenu = new Menu("cafe menu", "dinner");
        MenuComponent dessertMenu = new Menu("dessert menu", "dessert od course");
        MenuComponent deliveryMenu = new Menu("Delivery", "Out of Cafe");


        MenuComponent allMenus = new Menu("All menu", "All menus combined");

//        allMenus.add(pancakeHouseMenu);
//        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(deliveryMenu);

        dinerMenu.add(new MenuItem("pasta",
                "italian macaroni",
                true,
                3.89));
        dessertMenu.add(new MenuItem(
                "apple pie",
                "like a warm apple pie",
                true,
                1.59
        ));
        pancakeHouseMenu.add(new MenuItem(
                "pancake",
                "pancake",
                false,9.8));

        dessertMenu.add(pancakeHouseMenu);
        cafeMenu.add(dinerMenu);
        cafeMenu.add(dessertMenu);

       /*********************************************************************************************/

       MenuComponent italian = new Menu("Italian", "Italian menu");
        MenuComponent japan = new Menu("Japan", "Japan menu");
        MenuComponent grill = new Menu("Grill", "grill menu");

        grill.add(new MenuItem("Shashlik", "Shashlik", false,3.30));
        japan.add(new MenuItem("Sushi", "Sushi", false, 8.28));
        italian.add(new MenuItem("Pizza", "Pizzza", false, 4.7));

        deliveryMenu.add(italian);
        deliveryMenu.add(japan);
        deliveryMenu.add(grill);


/*
        dinerMenu.add(new MenuItem("pasta",
                "italian macaroni",
                true,
                3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "apple pie",
                "like a warm apple pie",
                true,
                1.59
        ));
        */
        Waitress waitress = new Waitress(allMenus);
        //waitress.print();
        System.out.println(dinerMenu.getChild(0).getName());

    }

}
