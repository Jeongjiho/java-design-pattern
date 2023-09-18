package designpatterns.command.receiver;

public class HotTub {
    private final String location;

    public HotTub(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " HotTub on!");
    }

    public void off() {
        System.out.println(location + " HotTub off!");
    }

    public void circulate() {
        System.out.println(location + " HotTub circulate!");
    }

    public void jetsOn() {
        System.out.println(location + " HotTub jetsOn!");
    }

    public void jetsOff() {
        System.out.println(location + " HotTub jetsOff!");
    }

    public void setTemperature() {
        System.out.println(location + " HotTub setTemperature!");
    }
}
