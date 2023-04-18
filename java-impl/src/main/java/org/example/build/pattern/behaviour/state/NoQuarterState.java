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
        System.out.println("money inserted, you can turn crack or eject money");
        this.gumballMachine.setState(gumballMachine.hadQuarterState);
    }

    /**
     * 退回硬币
     */
    @Override
    public void ejectQuarter() {
        System.out.println("you should insert quarter first");
    }

    /**
     * 转动手柄
     */
    @Override
    public void turnCrank() {
        System.out.println("you should insert quarter first");
    }

    /**
     * 弹出糖果
     */
    @Override
    public void dispense() {
        System.out.println("you should insert quarter first");
    }
}
