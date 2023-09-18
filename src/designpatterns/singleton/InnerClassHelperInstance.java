package designpatterns.singleton;

public class InnerClassHelperInstance {

    private double random = Math.random();

    private InnerClassHelperInstance() {
    }

    private static final class InstanceHolder {
        private static final InnerClassHelperInstance instance = new InnerClassHelperInstance();
    }

    public static InnerClassHelperInstance getInstance() {
        return InstanceHolder.instance;
    }

    public void print() {
        System.out.println("i'm inner class helper singleton instance !!");
        System.out.println(random);
    }

}
