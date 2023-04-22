package org.example.build.pattern.struct.proxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        Target proxy = new TargetProxy(target);
        proxy.doSomething();



        // java  动态代理，代理类（TargetImpl）需要实现接口才能用

        Target proxy2 = (Target) Proxy.newProxyInstance(Target.class.getClassLoader(),
                new Class[] {Target.class}, new DynamicProxyHandler(target));
        proxy2.doSomething();

        TargetImpl2 target2 = new TargetImpl2();
        CglibProxy cglibProxy = new CglibProxy();
        TargetImpl2 proxy3 = (TargetImpl2) cglibProxy.getInstance(target2);
        proxy3.doSomething();

    }



}
