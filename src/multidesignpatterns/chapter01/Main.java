package multidesignpatterns.chapter01;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        main.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("오리 시뮬레이션 게임: 무리 (+컴포지트)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        /*Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);*/

        System.out.println("\n오리 시뮬레이션 게임: 전체 무리");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        /*System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
        simulate(flockOfMallards);*/

        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
