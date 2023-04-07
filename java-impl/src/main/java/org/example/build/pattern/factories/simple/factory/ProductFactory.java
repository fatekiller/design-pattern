package org.example.build.pattern.factories.simple.factory;


import java.util.Objects;

public class ProductFactory {
    public static Product getProduct(String productType) throws Exception {
        if (Objects.equals(productType, "productA")) {
            return new ProductA();
        } else if (Objects.equals(productType, "productB")) {
            return new ProductB();
        }
        throw new Exception("invalid product type");
    }
}
