package designpatterns.strategy.original;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("RubberDuck::quack!");
    }

    @Override
    void display() {
        System.out.println("RubberDuck::display!");
    }

    @Override
    public void fly() {
    }
}
