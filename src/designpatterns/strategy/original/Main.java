package designpatterns.strategy.original;

public class Main {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.fly();

        System.out.println("==========================================");

        Duck redHeadDuck = new RedHeadDuck();

        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.display();
        redHeadDuck.fly();

        System.out.println("==========================================");

        Duck rubberDuck = new RubberDuck();

        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.fly();


    }

}
