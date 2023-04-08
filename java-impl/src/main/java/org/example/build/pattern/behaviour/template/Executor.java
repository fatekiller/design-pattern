package org.example.build.pattern.behaviour.template;

public abstract class Executor {

    public void execute() {
        System.out.println("begin do sth:");
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("step 3");
    }

    // todo finish me
    protected abstract void step3();


}
