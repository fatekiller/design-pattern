package org.example.build.pattern.struct.decorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new PureCoffee();
        Coffee coffeeWithMilk = new MilkCoffee(coffee);
        System.out.println(coffeeWithMilk.prize());
        Coffee coffeeDoubleMilk = new MilkCoffee(coffeeWithMilk);
        System.out.println(coffeeDoubleMilk.prize());
        Coffee coffeeMilkSugar = new SugarCoffee(coffeeWithMilk);
        System.out.println(coffeeMilkSugar.prize());
    }
}
