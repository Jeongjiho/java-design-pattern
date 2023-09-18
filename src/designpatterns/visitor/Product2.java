package designpatterns.visitor;

public class Product2 implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("product2###");
        visitor.visit(this);
    }
}
