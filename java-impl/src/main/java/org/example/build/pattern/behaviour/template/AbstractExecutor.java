package org.example.build.pattern.behaviour.template;

public abstract class AbstractExecutor {

    public void execute() {
        System.out.println("begin do sth:");
        System.out.println("step 1");
        System.out.println("step 2");
        step3();
    }

    protected abstract void step3();


}
