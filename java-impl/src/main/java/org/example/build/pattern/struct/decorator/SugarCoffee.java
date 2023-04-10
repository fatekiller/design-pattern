package org.example.build.pattern.struct.decorator;

public class SugarCoffee implements Coffee {
    private final Coffee coffee;

    public SugarCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double prize() {
        return 0.4 + coffee.prize();
    }
}
