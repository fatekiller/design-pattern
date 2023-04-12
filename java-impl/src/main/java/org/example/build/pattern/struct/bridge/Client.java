package org.example.build.pattern.struct.bridge;

/**
 * 需要两个抽象操作组合成一个操作时，一个操作组合另一个操作的接口，分开实现，避免需要太多的类，比如画不同颜色的图，如果颜色3种，图3三种
 * 则有9种具体情况，如果只有一个抽象类，则要有9种实现，但是颜色和形状分开定义的话，则各6种就行
 */
public class Client {
    public static void main(String[] args) {
        Color red = new Red();
        Color green = new Green();

        Shape rectangle = new Rectangle(red);
        rectangle.draw();
        Shape rectangle2 = new Rectangle(green);
        rectangle2.draw();

        Shape circle = new Circle(red);
        circle.draw();
        Shape circle2 = new Circle(green);
        circle2.draw();
    }
}
