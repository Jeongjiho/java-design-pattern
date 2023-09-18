package designpatterns.abstractfactory.store;

import designpatterns.abstractfactory.ingredientfactory.NYPizzaIngredientFactory;
import designpatterns.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import designpatterns.abstractfactory.menu.Menu;
import designpatterns.abstractfactory.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(Menu.CHEESE.getMenu().equals(item)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        }
        else if(Menu.VEGGIE.getMenu().equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        }
        else if(Menu.CLAM.getMenu().equals(item)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        }
        else if(Menu.PEPPERONI.getMenu().equals(item)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }

        return pizza;
    }
}
