package org.example.build.pattern.behaviour.listener;

public class ListenerB implements Listener {
    @Override
    public void handle(Event event) {
        System.out.println("listener B handle " + event.name);
    }
}
