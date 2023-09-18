package designpatterns.facade.computer;

public class Computer {

    private final Cpu cpu;
    private final Memory memory;
    private final HardDisk hardDisk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        hardDisk = new HardDisk();
    }

    public void startOn() {
        cpu.initCpu();
        memory.checkMemory();
        hardDisk.bootHardDiskDrive();
        System.out.println("start on");
    }

    public void shutdown() {
        cpu.shutdown();
        memory.shutdown();
        hardDisk.shutdown();
        System.out.println("shutdown");
    }

}
