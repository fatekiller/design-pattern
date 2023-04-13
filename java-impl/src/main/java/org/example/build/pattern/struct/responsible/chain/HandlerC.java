package org.example.build.pattern.struct.responsible.chain;

public class HandlerC extends AbstractHandler{
    public HandlerC(AbstractHandler next) {
        super(next);
    }

    @Override
    boolean handle(int score) {
        System.out.println("handle in HandlerC");
        return true;
    }
}
