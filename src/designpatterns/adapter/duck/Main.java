package designpatterns.adapter.duck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        useDuck(mallardDuck);

        Duck turkeyDuck = new TurkeyAdapter(new WildTurkey());
        useDuck(turkeyDuck);
    }

    public static void useDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
