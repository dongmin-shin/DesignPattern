package main;

import executor.*;

/**
 * Created by DongMinShin on 2016. 4. 24..
 */
public class Main {

    public static void main(String args[]) {

        // Observer Pattern
//        ObserverPatternExecutor observerPattern = new ObserverPatternExecutor();
//        observerPattern.execute();

        // Iterator Pattern
//        IteratorPatternExecutor iteratorPattern = new IteratorPatternExecutor();
//        iteratorPattern.execute();

        // Factory Pattern
//        FactoryPatternExecutor factoryPattern = new FactoryPatternExecutor();
//        factoryPattern.execute();

        // Proxy Pattern
//        PatternExecutor proxyPattern = new ProxyPatternExecutor();
//        proxyPattern.execute();

        // Command Pattern
//        CommandPatternExecutor commandPattern = new CommandPatternExecutor();
//        commandPattern.execute();

        // Interpreter Pattern
        InterpreterPatternExecutor interpreterPattern = new InterpreterPatternExecutor();
        interpreterPattern.execute();

    }

}
