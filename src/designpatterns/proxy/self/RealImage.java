package designpatterns.proxy.self;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    private void loadImage() {
        System.out.println("load : " + fileName);
    }

    @Override
    public void display() {
        System.out.println("display : " + fileName);
    }
}
