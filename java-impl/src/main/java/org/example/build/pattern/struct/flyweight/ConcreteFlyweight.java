package org.example.build.pattern.struct.flyweight;

public class ConcreteFlyweight implements FlyWeight{
    private String innerState;

    public ConcreteFlyweight(String innerState) {
        this.innerState = innerState;
    }

    @Override
    public void operation(String outState) {
        System.out.println("inner state "+innerState);
        System.out.println("outer state "+outState);
    }
}
