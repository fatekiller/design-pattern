package org.example.build.pattern.behaviour.state;

public interface State {

    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退回硬币
     */
    void ejectQuarter();

    /**
     * 转动手柄
     */
    void turnCrank();

    /**
     * 弹出糖果
     */
    void dispense();
}
