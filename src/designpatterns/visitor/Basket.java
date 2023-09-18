package designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Element {
    List<Element> basket;

    public Basket() {
        basket = new ArrayList<>();
        basket.add(new Product1());
        basket.add(new Product2());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Basket###");
        visitor.visit(this);
        for(Element e : basket) {
            e.accept(visitor);
        }
    }
}
