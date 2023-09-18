package designpatterns.memento;

public class Original {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveMemento() {
        return new Memento(state);
    }

    public void loadMemento(Memento memento) {
        state = memento.state();
    }

}
