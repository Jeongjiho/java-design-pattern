package designpatterns.command.command.ceilingfan;

import designpatterns.command.command.Command;
import designpatterns.command.receiver.CeilingFan;

public class CeilingFanLowCommand implements Command {
    private final CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        else if(prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        else if(prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        else if(prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
