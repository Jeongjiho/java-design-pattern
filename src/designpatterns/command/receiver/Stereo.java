package designpatterns.command.receiver;

public class Stereo {
    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo on!");
    }

    public void off() {
        System.out.println(location + " Stereo off!");
    }

    public void setCd() {
        System.out.println(location + " Stereo setCd");
    }

    public void setDvd() {
        System.out.println(location + " Stereo setDvd");
    }

    public void setRadio() {
        System.out.println(location + " Stereo setRadio");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Stereo setVolume " + volume);
    }
}
