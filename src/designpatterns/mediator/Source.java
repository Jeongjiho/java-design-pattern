package designpatterns.mediator;

public interface Source {
    void setMediator(Mediator mediator);
    void eventOccured(String event);
}