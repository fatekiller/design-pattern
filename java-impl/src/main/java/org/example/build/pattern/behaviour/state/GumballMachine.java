package org.example.build.pattern.behaviour.state;

/**
 * 糖果机有四个状态：
 * 没钱 -- 充钱 --》有钱 -- 转动手柄 --》糖果发放中 -- 弹出糖果 --》没钱 or 卖完了
 */
public class GumballMachine {

    State noQuarterState;

    State hadQuarterState;

    State soldState;

    State soldOutState;

    State currentState;

    int count;


    public GumballMachine(int count) {
        this.count = count;
        this.noQuarterState = new NoQuarterState(this);
        this.hadQuarterState = new HadQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldState(this);
        this.currentState = soldOutState;
        if (count > 0) {
            this.currentState = noQuarterState;
        }
    }
}
