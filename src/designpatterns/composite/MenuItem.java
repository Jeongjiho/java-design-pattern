package designpatterns.composite;

public class MenuItem extends MenuComponent {

    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(getName());
        if(isVegetarian()) {
            sb.append("(v)");
        }
        sb.append(", ").append(getPrice()).append("\n").append("    -- ").append(getDescription());
        System.out.println(sb);
    }
}
