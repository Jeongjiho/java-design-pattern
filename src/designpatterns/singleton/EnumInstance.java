package designpatterns.singleton;

public enum EnumInstance {

    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}