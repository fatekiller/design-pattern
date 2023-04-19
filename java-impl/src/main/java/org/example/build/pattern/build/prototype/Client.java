package org.example.build.pattern.build.prototype;

public class Client {

    public static void main(String[] args) {
        Prototype p1 = new Prototype(1, "2", 3.0f);
        System.out.println(p1);

        System.out.println(p1.clone());
    }
}
