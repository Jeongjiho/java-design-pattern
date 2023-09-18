package designpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Basket basket = new Basket();

        basket.accept(store);
    }
}
