package designpatterns.templatemethod.abstractlist;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] ducks = {"A", "B", "C", "D"};
        MyStringList duckList = new MyStringList(ducks);
        System.out.println(duckList);
        List duckSubList = duckList.subList(2, 3);
        System.out.println(duckSubList);

    }

}
