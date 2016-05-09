package main;

import executor.FactoryPattern;
import executor.IteratorPattern;
import executor.ObserverPattern;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class Main {

    public static void main(String args[]) {

        // Observer Pattern
//        ObserverPattern observerPattern = new ObserverPattern();
//        observerPattern.execute();

        // Iterator Pattern
//        IteratorPattern iteratorPattern = new IteratorPattern();
//        iteratorPattern.execute();

        // Factory Pattern
        FactoryPattern factoryPattern = new FactoryPattern();
        factoryPattern.execute();

    }

}
