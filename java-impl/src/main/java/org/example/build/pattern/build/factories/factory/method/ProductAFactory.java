package org.example.build.pattern.build.factories.factory.method;

public class ProductAFactory implements ProductFactory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
