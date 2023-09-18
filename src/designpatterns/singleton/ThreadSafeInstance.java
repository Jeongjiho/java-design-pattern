package designpatterns.singleton;

public class ThreadSafeInstance {

    private static ThreadSafeInstance instance;
    private double random = Math.random();

    private ThreadSafeInstance() {
    }

    public synchronized static ThreadSafeInstance getInstance() {
        if(instance == null) {
            instance = new ThreadSafeInstance();
        }
        return instance;
    }

    public void print() {
        System.out.println("i'm thread safe singleton instance !!");
        System.out.println(random);
    }

}