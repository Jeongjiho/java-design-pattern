package designpatterns.decorator.car;

public class Main {

    public static void main(String[] args) {
        Car car = new Bmw();

        System.out.println(car.cost());

        Audio bmwWithAudio = new Audio(car);

        System.out.println(bmwWithAudio.cost());

        Wheel bmwWuthAudioWithWheel = new Wheel(bmwWithAudio);

        System.out.println(bmwWuthAudioWithWheel.cost());
    }

}
