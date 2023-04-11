package org.example.build.pattern.struct.adaptor;

/**
 * 两个类的行为有关联，但是含义不同，可以通过某种转换将一个类转换为Target时，可以用适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Target simpleMulti = new SimpleMulti();
        System.out.println(simpleMulti.multi(3,9));
        Target addMulti = new MultiAdaptor(new Adder());
        System.out.println(addMulti.multi(3, 9));
    }
}
