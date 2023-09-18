package designpatterns.command;

import designpatterns.command.command.Command;
import designpatterns.command.command.MacroCommand;
import designpatterns.command.command.ceilingfan.CeilingFanHighCommand;
import designpatterns.command.command.ceilingfan.CeilingFanLowCommand;
import designpatterns.command.command.ceilingfan.CeilingFanMediumCommand;
import designpatterns.command.command.ceilingfan.CeilingFanOffCommand;
import designpatterns.command.command.garagedoor.GarageDoorDownCommand;
import designpatterns.command.command.garagedoor.GarageDoorUpCommand;
import designpatterns.command.command.hottub.HotTubOnCommand;
import designpatterns.command.command.hottub.HotTubeOffCommand;
import designpatterns.command.command.light.LightOffCommand;
import designpatterns.command.command.light.LightOnCommand;
import designpatterns.command.command.stereo.StereoOffCommand;
import designpatterns.command.command.stereo.StereoOnWIthCDCommand;
import designpatterns.command.command.tv.TvOffCommand;
import designpatterns.command.command.tv.TvOnCommand;
import designpatterns.command.receiver.*;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        // Living Room Light Command
        System.out.println("######Living Room Light Command######");
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        // Garage Door Command
        System.out.println("######Garage Door Command######");
        GarageDoor garageDoor = new GarageDoor("Garage");
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        remoteControl.setCommand(1, garageDoorUpCommand, garageDoorDownCommand);

        // Command Interface Method 하나만 있을 경우 아래와 같은 람다 형식 사용이 가능
        //remoteControl.setCommand(1, garageDoor::up, garageDoor::down);

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPushed(1);

        // Living Room Stereo Command
        System.out.println("######Living Room Stereo Command######");
        Stereo stereo = new Stereo("Living Room");
        StereoOnWIthCDCommand stereoOnWIthCDCommand = new StereoOnWIthCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(2, stereoOnWIthCDCommand, stereoOffCommand);

        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPushed(2);

        // Living Room Ceiling Fan Command
        System.out.println("######Living Room Ceiling Fan Command######");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanLowCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        // Macro Command
        System.out.println("######Macro Command######");
        Tv tv = new Tv("Living Room");
        HotTub hotTub = new HotTub("Living Room");

        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        HotTubOnCommand hotTubOnCommand = new HotTubOnCommand(hotTub);
        HotTubeOffCommand hotTubeOffCommand = new HotTubeOffCommand(hotTub);

        Command[] partyOn = { lightOnCommand, stereoOnWIthCDCommand, tvOnCommand, hotTubOnCommand };
        Command[] partyOff = { lightOffCommand, stereoOffCommand, tvOffCommand, hotTubeOffCommand };

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnCommand, partyOffCommand);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println("######Macro Command undo######");
        remoteControl.undoButtonWasPushed();

    }
}
