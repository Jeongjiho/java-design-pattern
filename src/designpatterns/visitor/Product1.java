package designpatterns.visitor;

public class Product1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Product1###");
        visitor.visit(this);
    }
}
