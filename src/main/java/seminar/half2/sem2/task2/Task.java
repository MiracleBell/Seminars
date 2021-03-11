package seminar.half2.sem2.task2;

import seminar.half2.sem2.task2.iface.ITask;

import java.util.Arrays;

public class Task implements ITask {
    private int[] arrayOfData;

    public Task(int... data) {
        if (data == null || data.length == 0) {
            throw new NullPointerException("data is empty or direction to null");
        }

        arrayOfData = new int[data.length];
        for (int i = 0; i < data.length; ++i) {
            arrayOfData[i] = data[i];
        }
    }

    public int getElement(int index) {
        if (index < 0 || index >= arrayOfData.length) {
            throw new IndexOutOfBoundsException("Incorrect index");
        }
        return arrayOfData[index];
    }

    @Override
    public int[] getData() {
        return arrayOfData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Arrays.equals(arrayOfData, task.arrayOfData);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayOfData);
    }
}
