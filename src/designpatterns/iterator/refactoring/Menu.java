package designpatterns.iterator.refactoring;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
