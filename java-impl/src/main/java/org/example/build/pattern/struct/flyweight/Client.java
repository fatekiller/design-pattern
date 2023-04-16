package org.example.build.pattern.struct.flyweight;

/**
 * 其实就是缓存对象，线程池，连接池等等用了这个技术，将一些比较重的资源缓存起来
 */
public class Client {
    public static void main(String[] args) {
        FlyWeight flyWeight1 = FlyweightFactory.getFlyweight("state1");
        flyWeight1.operation("out state1");

        FlyWeight flyWeight2 = FlyweightFactory.getFlyweight("state1");
        flyWeight1.operation("out state2");
    }
}
