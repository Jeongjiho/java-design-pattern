package designpatterns.command.command.stereo;

import designpatterns.command.command.Command;
import designpatterns.command.receiver.Stereo;

public class StereoOnWIthCDCommand implements Command {
    Stereo stereo;

    public StereoOnWIthCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
