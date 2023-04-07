package org.example.build.pattern.factories.simple.factory;

/**
 * 简单工厂：一个抽象的产品，一个按产品类型调用不同实例化方法的构造静态方法
 */
public class FactoryTest {
    public static void main(String[] args) throws Exception {
        Product pa = ProductFactory.getProduct("productA");
        System.out.println(pa.name());
        Product pb = ProductFactory.getProduct("productB");
        System.out.println(pb.name());
    }
}
