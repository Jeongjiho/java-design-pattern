package designpatterns.command.command.tv;

import designpatterns.command.command.Command;
import designpatterns.command.receiver.Tv;

public class TvOnCommand implements Command {
    private final Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
