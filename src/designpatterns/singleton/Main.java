package designpatterns.singleton;

public class Main {

    public static void main(String[] args) {
        Instance instance = Instance.getInstance();
        //instance.print();

        //LazyInstance lazyInstance = LazyInstance.getInstance();
        //lazyInstance.print();
        //lazyInstance.print();

        //ThreadSafeInstance threadSafeInstance = ThreadSafeInstance.getInstance();

        System.out.println("여기서 시작");
        Runnable task = () -> {
            for (int index = 0; index < 10; index++) {
                EnumInstance.INSTANCE.getValue();
            }
        };

        Thread t = new Thread(task);
        t.start();

    }

}
