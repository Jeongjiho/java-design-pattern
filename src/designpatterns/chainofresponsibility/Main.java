package designpatterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();

        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new RequestNumber(90));
        c1.process(new RequestNumber(-50));
        c1.process(new RequestNumber(0));
    }

}
