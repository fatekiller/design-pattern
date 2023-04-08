package org.example.build.pattern.behaviour.strategy;

public class Client {
    public static void main(String[] args) {
        System.out.println("use strategy 1");
        Executor executor1 = new Executor(new StrategyA());
        executor1.execute();

        System.out.println();

        System.out.println("use strategy 2");
        Executor executor2 = new Executor(new StrategyB());
        executor2.execute();
    }
}
