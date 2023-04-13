package org.example.build.pattern.struct.responsible.chain;

/**
 * 就是web框架种的那种中间件和filter
 */
public class Client {

    public static void main(String[] args) {
        HandlerC handlerC = new HandlerC(null);
        HandlerB handlerB = new HandlerB(handlerC);
        HandlerA handlerA = new HandlerA(handlerB);

        handlerA.execute(100);
    }
}
