package designpatterns.facade.hometheater;

public class Amplifier {

    private Tuner tuner;
    private StreamingPlayer player;

    public void on() {
        System.out.println("Amplifier on!");
    }

    public void off() {
        System.out.println("Amplifier off!");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setStereoSound() {
        System.out.println("Amplifier setStereoSound!");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setSurroundSound!");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier setVolume " + volume);
    }

}
