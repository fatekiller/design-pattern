package org.example.build.pattern.build.builder;

public class Client {
    public static void main(String[] args) {
        User u = User.newBuilder().name("zhangsan").age(11).password("pass").build();
        System.out.println(u);
    }
}
