package ru.sbt.javaschool.step2;

import ru.sbt.javaschool.step2.adapter.PenguinAdapter;
import ru.sbt.javaschool.step2.adapter.TurkeyAdapter;
import ru.sbt.javaschool.step2.base.Duck;
import ru.sbt.javaschool.step2.base.MallarDuck;
import ru.sbt.javaschool.step2.out.Penguin;
import ru.sbt.javaschool.step2.out.WildTurkey;

public class AdapterPattern {

    public static void main(String[] args) {

        Duck duck = new MallarDuck();
        Penguin penguin = new Penguin();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Duck penduck = new PenguinAdapter(penguin);


        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe PenguinAdapter says...");
        testDuck(penduck);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
