package designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List<Destination> list = new ArrayList<>();

    public void addDestination(Destination destination) {
        list.add(destination);
    }

    public void onEvent(String from, String event) {
        for(Destination destination : list) {
            destination.receiveEvent(from, event);
        }
    }
}