package multidesignpatterns.chapter01;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObserver();
}
