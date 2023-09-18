package designpatterns.command.command.tv;

import designpatterns.command.command.Command;
import designpatterns.command.receiver.Tv;

public class TvOffCommand implements Command {
    private final Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
