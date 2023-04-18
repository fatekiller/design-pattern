package org.example.build.pattern.behaviour.state;

public class Client {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(1);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrack();
        gumballMachine.turnCrack();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrack();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrack();
    }
}
