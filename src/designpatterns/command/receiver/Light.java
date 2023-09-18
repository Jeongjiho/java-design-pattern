package designpatterns.command.receiver;

public class Light {
    private String location;

    public Light(String location) {
        this. location = location;
    }

    public void on() {
        System.out.println(location + " Light On!");
    }
    public void off() {
        System.out.println(location + " Light Off!");
    }
}
