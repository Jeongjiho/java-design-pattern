package designpatterns.facade.hometheater;

public class Projector {

    private final StreamingPlayer streamingPlayer;

    public Projector(StreamingPlayer streamingPlayer) {
        this.streamingPlayer = streamingPlayer;
    }

    public void on() {
        System.out.println("Projector on!");
    }

    public void off() {
        System.out.println("Projector off!");
    }

    public void tvMode() {
        System.out.println("Projector tvMode!");
    }

    public void wideScreenMode() {
        System.out.println("Projector wideScreenMode!");
    }

    @Override
    public String toString() {
        return "Projector{" +
                "streamingPlayer=" + streamingPlayer +
                '}';
    }

}
