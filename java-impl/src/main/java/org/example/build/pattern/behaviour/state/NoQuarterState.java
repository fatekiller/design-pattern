package org.example.build.pattern.behaviour.state;

public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投币
     */
    @Override
    public void insertQuarter() {

    }

    /**
     * 退回硬币
     */
    @Override
    public void ejectQuarter() {

    }

    /**
     * 转动手柄
     */
    @Override
    public void turnCrank() {

    }

    /**
     * 弹出糖果
     */
    @Override
    public void dispense() {

    }
}
