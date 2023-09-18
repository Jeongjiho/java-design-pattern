package designpatterns.visitor;

public class Store implements Visitor {
    @Override
    public void visit(Basket basket) {
        System.out.println("use basket");
    }

    @Override
    public void visit(Product1 product1) {
        System.out.println("add product1");
    }

    @Override
    public void visit(Product2 product2) {
        System.out.println("add product2");
    }
}
