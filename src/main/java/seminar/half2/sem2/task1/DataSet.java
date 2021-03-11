package seminar.half2.sem2.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DataSet implements Iterable<Data> {
    private List<Data> dataList;


    public DataSet() {
        dataList = new LinkedList<>();
    }

    public void pushBack(Data data) {
        if (data == null) {
            throw new NullPointerException("data direction to null");
        }
        dataList.add(data);
    }

    public void sort() {
        dataList.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
    }

/*
    @Override
    public void remove() {
        if (dataList.size() == 0) {
            throw new IndexOutOfBoundsException("You can't remove element from empty list");
        }
        dataList.remove(dataList.size() - 1);
    }
*/

    @Override
    public Iterator<Data> iterator() {
        return dataList.iterator();
    }
}
