package designpatterns.decorator.car;

public class Audio extends CarDecorator{
    public Audio(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        return car.cost() + 20000;
    }
}
