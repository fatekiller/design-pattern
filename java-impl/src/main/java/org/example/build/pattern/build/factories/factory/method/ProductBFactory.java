package org.example.build.pattern.build.factories.factory.method;

public class ProductBFactory implements ProductFactory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
