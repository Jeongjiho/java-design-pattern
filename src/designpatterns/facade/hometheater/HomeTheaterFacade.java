package designpatterns.facade.hometheater;

public class HomeTheaterFacade {

    private final Amplifier amplifier;
    private final Tuner tuner;
    private final StreamingPlayer player;
    private final Projector projector;
    private final TheaterLights lights;
    private final Screen screen;
    private final PopcornPopper popcornPopper;

    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.tuner = new Tuner(amplifier);
        this.player = new StreamingPlayer(amplifier);
        this.projector = new Projector(player);
        this.screen = new Screen();
        this.lights = new TheaterLights();
        this.popcornPopper = new PopcornPopper();
    }

    public void watchMovie(String movie) {
        System.out.println("ready to watch a movie.");
        popcornPopper.on();
        popcornPopper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        player.on();
        player.play();
    }

    public void endMovie() {
        System.out.println("Turning off the home theater.");
        popcornPopper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }

}
