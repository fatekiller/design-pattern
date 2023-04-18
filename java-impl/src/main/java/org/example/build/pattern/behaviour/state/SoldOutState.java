package org.example.build.pattern.behaviour.state;

public class SoldOutState implements State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投币
     */
    @Override
    public void insertQuarter() {
        System.out.println("this machine is sold out");
    }

    /**
     * 退回硬币
     */
    @Override
    public void ejectQuarter() {
        System.out.println("please insert quarter first");
    }

    /**
     * 转动手柄
     */
    @Override
    public void turnCrank() {
        System.out.println("please insert quarter first");
    }

    /**
     * 弹出糖果
     */
    @Override
    public void dispense() {
        System.out.println("please insert quarter first");
    }
}
