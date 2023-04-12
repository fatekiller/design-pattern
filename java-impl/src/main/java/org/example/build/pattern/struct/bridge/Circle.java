package org.example.build.pattern.struct.bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    protected void draw() {
        System.out.println("draw Circle in " + color.color());
    }
}
