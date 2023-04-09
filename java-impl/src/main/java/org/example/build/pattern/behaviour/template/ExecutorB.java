package org.example.build.pattern.behaviour.template;

import org.example.build.pattern.behaviour.strategy.Executor;

public class ExecutorB extends AbstractExecutor {
    @Override
    protected void step3() {
        System.out.println("execute step3 in ExecutorB");
    }
}
