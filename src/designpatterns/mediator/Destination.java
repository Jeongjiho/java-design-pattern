package designpatterns.mediator;

public interface Destination {
    void receiveEvent(String from, String event);
}