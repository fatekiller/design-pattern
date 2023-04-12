package org.example.build.pattern.struct.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    protected void draw() {
        System.out.println("draw Rectangle in " + color.color());
    }
}
