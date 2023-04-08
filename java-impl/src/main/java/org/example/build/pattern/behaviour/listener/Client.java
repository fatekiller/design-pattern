package org.example.build.pattern.behaviour.listener;

/**
 * 一个执行器，执行主逻辑，在里面的关键节点配置一些钩子，将参数传递进去之后进行回调处理，比如处理网络请求的返回结果
 */
public class Client {
    public static void main(String[] args) {
        Runner runner = new Runner();
        ListenerA listenerA = new ListenerA();
        ListenerB listenerB = new ListenerB();
        runner.addListener(listenerA);
        runner.addListener(listenerB);
        runner.run("event");
    }
}
