package designpatterns.strategy.refactoring;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyWithWings::fly!");
    }
}
