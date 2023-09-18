package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private final List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
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
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(getName()).append(", ").append(getDescription()).append("\n").append("-----------------");
        System.out.println(sb);

        for(MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
