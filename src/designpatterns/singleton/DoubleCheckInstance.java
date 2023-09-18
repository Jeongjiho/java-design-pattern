package designpatterns.singleton;

public class DoubleCheckInstance {

    private static DoubleCheckInstance instance;
    private double random = Math.random();

    private DoubleCheckInstance() {
    }

    public static DoubleCheckInstance getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckInstance.class) {
                if(instance == null) {
                    instance = new DoubleCheckInstance();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("i'm double check lock singleton instance !!");
        System.out.println(random);
    }

}