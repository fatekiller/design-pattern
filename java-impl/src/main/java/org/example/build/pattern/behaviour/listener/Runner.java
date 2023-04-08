package org.example.build.pattern.behaviour.listener;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    private List<Listener> listenerList = new ArrayList<>();

    public void addListener(Listener l) {
        listenerList.add(l);
    }

    public void run(String eventName) {
        Event event = new Event(eventName);
        for(Listener l:listenerList) {
            l.handle(event);
        }
    }


}
