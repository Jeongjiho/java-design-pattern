package designpatterns.proxy.machine;

public class SoldOutState implements State {

    private final Machine machine;

    public SoldOutState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진입니다.");
    }

}
