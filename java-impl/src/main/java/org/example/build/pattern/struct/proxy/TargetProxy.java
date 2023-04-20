package org.example.build.pattern.struct.proxy;

public class TargetProxy implements Target {

    Target target;

    public TargetProxy(Target target) {
        this.target = target;
    }


    @Override
    public void doSomething() {
        System.out.println("before");
        target.doSomething();
        System.out.println("after");
    }
}
