package org.example.build.pattern.factories.abstracted.factory;

public class FactoryImpl1 implements AbstractFactory{
    @Override
    public AbstractProductA createA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createB() {
        return new ConcreteProductB1();
    }
}
