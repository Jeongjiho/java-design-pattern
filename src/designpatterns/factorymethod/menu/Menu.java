package designpatterns.factorymethod.menu;

public enum Menu {
    CHEESE("cheese"), VEGGIE("veggie"), CLAM("clam"), PEPPERONI("pepperoni");

    private final String menu;
    private Menu(String menu) {
        this.menu = menu;
    }

    public String getMenu()  {
        return this.menu;
    }
}
