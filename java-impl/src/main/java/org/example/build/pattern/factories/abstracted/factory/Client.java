package org.example.build.pattern.factories.abstracted.factory;


/**
 * 抽象工厂相比前两种又多了一个维度，即相同类型的产品也有不同的构造方式，因此工厂也需要进行抽象，以实现在不同的工厂实现类中创建出同一类产品的不同实现
 */
public class Client {


    public static void main(String[] args) {

        AbstractFactory f1 = new FactoryImpl1();
        AbstractProductA pa1 = f1.createA();
        AbstractProductB pb1 = f1.createB();

        System.out.println(pa1.func1());
        System.out.println(pb1.func2());

        AbstractFactory f2 = new FactoryImpl1();
        AbstractProductA pa2 = f2.createA();
        AbstractProductB pb2 = f2.createB();

        System.out.println(pa2.func1());
        System.out.println(pb2.func2());


    }
}
