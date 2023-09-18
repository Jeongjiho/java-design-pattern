package designpatterns.templatemethod.refactoring;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중.");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중.");
    }

    public boolean customerWantsCondiments() {
        return true;
    }

}
