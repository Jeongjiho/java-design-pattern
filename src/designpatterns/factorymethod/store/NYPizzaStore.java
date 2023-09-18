package designpatterns.factorymethod.store;

import designpatterns.factorymethod.menu.Menu;
import designpatterns.factorymethod.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(Menu.CHEESE.getMenu().equals(item)) {
            return new NYStyleCheesePizza();
        }
        else if(Menu.VEGGIE.getMenu().equals(item)) {
            return new NYStyleVeggiePizza();
        }
        else if(Menu.CLAM.getMenu().equals(item)) {
            return new NYStyleClamPizza();
        }
        else if(Menu.PEPPERONI.getMenu().equals(item)) {
            return new NYStylePepperoniPizza();
        }
        else {
            return null;
        }
    }
}
