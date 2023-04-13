package org.example.build.pattern.struct.responsible.chain;

public class HandlerA extends AbstractHandler{
    public HandlerA(AbstractHandler next) {
        super(next);
    }

    @Override
    boolean handle(int score) {
        System.out.println("handle in HandlerA");
        return true;
    }
}
