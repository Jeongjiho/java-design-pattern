package designpatterns.iterator.refactoring;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        ++position;
        return menuItem;
    }
}
