package org.example.build.pattern.behaviour.listener;

public class ListenerA implements Listener {
    @Override
    public void handle(Event event) {
        System.out.println("listener A handle " + event.name);
    }
}
