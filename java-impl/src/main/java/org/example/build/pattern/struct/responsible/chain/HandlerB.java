package org.example.build.pattern.struct.responsible.chain;

public class HandlerB extends AbstractHandler{
    public HandlerB(AbstractHandler next) {
        super(next);
    }

    @Override
    boolean handle(int score) {
        System.out.println("handle in HandlerB");
        return true;
    }
}
