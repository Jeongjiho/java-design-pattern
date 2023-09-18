package designpatterns.singleton;

public class Instance {

    private static final Instance instance = new Instance();

    private Instance() {
    }

    public static Instance getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("i'm singleton instance !!");
    }

}
