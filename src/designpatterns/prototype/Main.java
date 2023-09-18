package designpatterns.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Data data1 = new Data();
        Data data2 = data1.clone();
        Data data3 = data1.clone();

        data1.setData("Data1");
        data2.setData("Data2");
        data3.setData("Data3");

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}
