package designpatterns.strategy.refactoring;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Duck::swim!");
    }

    abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

}
