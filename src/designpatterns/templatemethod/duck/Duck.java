package designpatterns.templatemethod.duck;

public class Duck implements Comparable<Duck> {
    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck o) {
        if(this.weight < o.weight) {
            return -1;
        }
        else if(this.weight == o.weight) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
