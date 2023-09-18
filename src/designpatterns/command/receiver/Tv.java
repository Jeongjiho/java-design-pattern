package designpatterns.command.receiver;

public class Tv {
    private final String location;

    public Tv(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Tv on!");
    }

    public void off() {
        System.out.println(location + " Tv off!");
    }

    public void setInputChannel() {
        System.out.println(location + " Tv setInputChannel!");
    }

    public void setVolume() {
        System.out.println(location + " Tv setVolume!");
    }
}
