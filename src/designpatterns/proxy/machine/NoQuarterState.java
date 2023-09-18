package designpatterns.proxy.machine;

import java.io.Serial;

public class NoQuarterState implements State {

    @Serial
    private static final long serialVersionUID = 2L;
    private final transient Machine machine;

    public NoQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요.");
    }
}
