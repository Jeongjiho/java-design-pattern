package designpatterns.templatemethod.duck;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Duck[] ducks = {
                new Duck("A", 5),
                new Duck("B", 3),
                new Duck("C", 2),
                new Duck("D", 1),
                new Duck("E", 6)
        };

        System.out.println("정렬 전:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("정렬 후:");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for(Duck d : ducks) {
            System.out.println(d);
        }
    }
}