package org.example.build.pattern.build.factories.abstracted.factory;

public class FactoryImpl2 implements AbstractFactory{
    @Override
    public AbstractProductA createA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createB() {
        return new ConcreteProductB2();
    }
}
