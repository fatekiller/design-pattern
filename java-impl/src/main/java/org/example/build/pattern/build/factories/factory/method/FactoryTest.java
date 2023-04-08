package org.example.build.pattern.build.factories.factory.method;

/**
 * 工厂方法模式是简单工厂的一个升级，将简单工厂中通过参数执行的if-else逻辑抽到了不同的实现类里面来做
 */
public class FactoryTest {
    public static void main(String[] args) {
        ProductFactory pfa = new ProductAFactory();
        ProductFactory pfb = new ProductBFactory();
        Product pa = pfa.getProduct();
        Product pb = pfb.getProduct();
        System.out.println(pa.name());
        System.out.println(pb.name());
    }
}
