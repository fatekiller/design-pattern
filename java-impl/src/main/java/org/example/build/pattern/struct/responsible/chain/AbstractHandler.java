package org.example.build.pattern.struct.responsible.chain;

public abstract class AbstractHandler {

    protected AbstractHandler next;

    public AbstractHandler(AbstractHandler next) {
        this.next = next;
    }

    void execute(int score) {
        if (handle(score) && this.next !=null) {
            this.next.execute(score);
        }
    }

    abstract boolean handle(int score);


}
