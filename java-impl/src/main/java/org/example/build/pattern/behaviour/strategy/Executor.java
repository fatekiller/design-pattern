package org.example.build.pattern.behaviour.strategy;

public class Executor {

    private Strategy strategy;


    public Executor(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("custom operation in step3:");
        strategy.doSomething();
        System.out.println("step 4");
    }

}
