package designpatterns.visitor;

public interface Visitor {
    void visit(Basket basket);
    void visit(Product1 product1);
    void visit(Product2 product2);
}
