package org.example.build.pattern.behaviour.state;

public class SoldState implements State{

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投币
     */
    @Override
    public void insertQuarter() {
        System.out.println("sold in progress");
    }

    /**
     * 退回硬币
     */
    @Override
    public void ejectQuarter() {
        System.out.println("sold in progress");
    }

    /**
     * 转动手柄
     */
    @Override
    public void turnCrank() {
        System.out.println("sold in progress");
    }

    /**
     * 弹出糖果
     */
    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count == 0) {
            System.out.println("gumball already sold out");
            gumballMachine.setState(gumballMachine.soldOutState);
        } else {
            gumballMachine.setState(gumballMachine.noQuarterState);
        }
    }
}
