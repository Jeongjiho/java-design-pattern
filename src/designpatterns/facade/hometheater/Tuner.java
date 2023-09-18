package designpatterns.facade.hometheater;

public class Tuner {

    private final Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Tuner on!");
    }

    public void off() {
        System.out.println("Tuner off!");
    }

    public void setAm() {
        System.out.println("Tuner setAm!");
    }

    public void setFm() {
        System.out.println("Tuner setFm!");
    }

    public void setFrequency() {
        System.out.println("Tuner setFrequency!");
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "amplifier=" + amplifier +
                '}';
    }

}
