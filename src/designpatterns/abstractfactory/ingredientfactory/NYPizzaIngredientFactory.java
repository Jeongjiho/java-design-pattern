package designpatterns.abstractfactory.ingredientfactory;

import designpatterns.abstractfactory.ingredient.cheese.Cheese;
import designpatterns.abstractfactory.ingredient.cheese.ReggianoCheese;
import designpatterns.abstractfactory.ingredient.clams.Clams;
import designpatterns.abstractfactory.ingredient.clams.FreshClams;
import designpatterns.abstractfactory.ingredient.dough.Dough;
import designpatterns.abstractfactory.ingredient.dough.ThinCrustDough;
import designpatterns.abstractfactory.ingredient.pepperoni.Pepperoni;
import designpatterns.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import designpatterns.abstractfactory.ingredient.sauce.MarinaraSauce;
import designpatterns.abstractfactory.ingredient.sauce.Sauce;
import designpatterns.abstractfactory.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }


    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
