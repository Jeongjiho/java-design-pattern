package designpatterns.singleton;

public class LazyInstance {

    private static LazyInstance instance;
    private double random = Math.random();

    private LazyInstance() {
    }

    public static LazyInstance getInstance() {
        if(instance == null) {
            instance = new LazyInstance();
        }
        return instance;
    }

    public void print() {
        System.out.println("i'm lazy singleton instance !!");
        System.out.println(random);
    }

}
