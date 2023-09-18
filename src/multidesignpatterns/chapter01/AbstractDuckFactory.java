package multidesignpatterns.chapter01;

public abstract class AbstractDuckFactory {
    abstract Quackable createMallardDuck();
    abstract Quackable createRedheadDuck();
    abstract Quackable createDuckCall();
    abstract Quackable createRubberDuck();
}
