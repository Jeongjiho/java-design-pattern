package designpatterns.abstractfactory.pizza;

import designpatterns.abstractfactory.ingredient.cheese.Cheese;
import designpatterns.abstractfactory.ingredient.clams.Clams;
import designpatterns.abstractfactory.ingredient.dough.Dough;
import designpatterns.abstractfactory.ingredient.pepperoni.Pepperoni;
import designpatterns.abstractfactory.ingredient.sauce.Sauce;
import designpatterns.abstractfactory.ingredient.veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {

    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clam +
                '}';
    }

}
