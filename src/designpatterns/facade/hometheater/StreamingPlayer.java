package designpatterns.facade.hometheater;

public class StreamingPlayer {

    private Amplifier amplifier;

    public StreamingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("StreamingPlayer on!");
    }

    public void off() {
        System.out.println("StreamingPlayer off!");
    }

    public void pause() {
        System.out.println("StreamingPlayer pause!");
    }

    public void play() {
        System.out.println("StreamingPlayer play!");
    }

    public void setSurroundAudio() {
        System.out.println("StreamingPlayer setSurroundAudio!");
    }

    public void setTwoChannelAudio() {
        System.out.println("StreamingPlayer setTwoChannelAudio!");
    }

    public void stop() {
        System.out.println("StreamingPlayer stop!");
    }

    @Override
    public String toString() {
        return "StreamingPlayer{" +
                "amplifier=" + amplifier +
                '}';
    }
}
