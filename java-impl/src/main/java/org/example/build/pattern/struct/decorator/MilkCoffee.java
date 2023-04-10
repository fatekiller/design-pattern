package org.example.build.pattern.struct.decorator;

public class MilkCoffee implements Coffee{

    private final Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public double prize() {
        return 0.5+coffee.prize();
    }
}
