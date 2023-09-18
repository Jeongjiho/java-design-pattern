package designpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Original original = new Original();
        CareTaker careTaker = new CareTaker();

        original.setState("State 1");
        original.setState("State 2");
        System.out.println("Current State : " + original.getState());

        careTaker.add(original.saveMemento());

        original.setState("State 3");

        careTaker.add(original.saveMemento());

        original.setState("State 4");
        System.out.println("Current State : " + original.getState());

        original.loadMemento(careTaker.get(0));
        System.out.println("Current State : " + original.getState());

        original.loadMemento(careTaker.get(1));
        System.out.println("Current State : " + original.getState());
    }
}
