package designpatterns.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Source tcp = new TcpComm();
        tcp.setMediator(mediator);

        Source system = new SystemSignal();
        system.setMediator(mediator);

        mediator.addDestination(new Display());
        mediator.addDestination(new Log());
        tcp.eventOccured("connected");

        System.out.println("=================================");

        tcp.eventOccured("disconnected");

        System.out.println("=================================");

        system.eventOccured("key input");

        System.out.println("=================================");

        system.eventOccured("mouse input");
    }
}