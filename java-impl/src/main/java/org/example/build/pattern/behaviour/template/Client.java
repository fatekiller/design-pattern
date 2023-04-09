package org.example.build.pattern.behaviour.template;

import org.example.build.pattern.behaviour.strategy.Executor;

public class Client {

    public static void main(String[] args) {
        AbstractExecutor executor1 = new ExecutorA();
        executor1.execute();

        AbstractExecutor executor2 = new ExecutorB();
        executor2.execute();
    }
}
