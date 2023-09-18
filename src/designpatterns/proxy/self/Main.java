package designpatterns.proxy.self;

public class Main {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("image.jpeg");
        proxyImage.display();
    }
}
