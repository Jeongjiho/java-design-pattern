package designpatterns.strategy.original;

public abstract class Duck {

    public void quack() {
        System.out.println("Duck::quack!");
    }

    public void swim() {
        System.out.println("Duck::swim!");
    }

    abstract void display();

    public void fly() {
        System.out.println("Duck::fly!");
    }

}
