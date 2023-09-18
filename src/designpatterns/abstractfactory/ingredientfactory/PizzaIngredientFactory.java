package designpatterns.abstractfactory.ingredientfactory;

import designpatterns.abstractfactory.ingredient.cheese.Cheese;
import designpatterns.abstractfactory.ingredient.clams.Clams;
import designpatterns.abstractfactory.ingredient.dough.Dough;
import designpatterns.abstractfactory.ingredient.pepperoni.Pepperoni;
import designpatterns.abstractfactory.ingredient.sauce.Sauce;
import designpatterns.abstractfactory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
