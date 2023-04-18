package org.example.build.pattern.behaviour.state;

public class HadQuarterState implements State{

    GumballMachine gumballMachine;

    public HadQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投币
     */
    @Override
    public void insertQuarter() {
        System.out.println("you had inserted a quarter");
    }

    /**
     * 退回硬币
     */
    @Override
    public void ejectQuarter() {
        this.gumballMachine.setState(gumballMachine.noQuarterState);
        System.out.println("money returned");
    }

    /**
     * 转动手柄
     */
    @Override
    public void turnCrank() {
        this.gumballMachine.setState(gumballMachine.soldState);
    }

    /**
     * 弹出糖果
     */
    @Override
    public void dispense() {
        System.out.println("please turn crack");
    }
}
