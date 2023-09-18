package designpatterns.command.command.hottub;

import designpatterns.command.command.Command;
import designpatterns.command.receiver.HotTub;

public class HotTubeOffCommand implements Command {
    private HotTub hotTub;

    public HotTubeOffCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.off();
    }

    @Override
    public void undo() {
        hotTub.on();
    }
}
