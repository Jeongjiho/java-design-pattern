package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Data implements Cloneable {

    private List<String> dataList;

    public Data() {
        dataList = new ArrayList<>();
        dataList.add("1");
        dataList.add("2");
        dataList.add("3");
    }

    public Data(List<String> dataList) {
        this.dataList = dataList;
    }

    public void setData(String data) {
        dataList.add(data);
    }

    @Override
    public Data clone() throws CloneNotSupportedException {
        return new Data(new ArrayList<>(this.dataList));
    }

    @Override
    public String toString() {
        return "Data{" +
                "dataList=" + dataList +
                '}';
    }
}
