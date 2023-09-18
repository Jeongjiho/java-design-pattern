package designpatterns.command.receiver;

public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " GarageDoor up!");
    }

    public void down() {
        System.out.println(location + " GarageDoor down!");
    }

    public void stop() {
        System.out.println(location + " GarageDoor stop!");
    }

    public void lightOn() {
        System.out.println(location + " GarageDoor lightOn!");
    }

    public void lightDown() {
        System.out.println(location + " GarageDoor lightDown!");
    }
}
