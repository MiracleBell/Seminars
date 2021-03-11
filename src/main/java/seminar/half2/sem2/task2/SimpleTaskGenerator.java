package seminar.half2.sem2.task2;

import seminar.half2.sem2.task2.iface.IBuffer;
import seminar.half2.sem2.task2.iface.ITask;
import seminar.half2.sem2.task2.iface.ITaskGenerator;

public class SimpleTaskGenerator implements ITaskGenerator {
    private SimpleTaskGenerator task;
    private IBuffer buffer;
    private int startValue;
    private int amount;


    public SimpleTaskGenerator(IBuffer buffer, int startValue, int amount) {
        if (buffer == null) {
            throw new NullPointerException("Buffer direction to null");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Field amount can't be smaller than 0");
        }
        this.buffer = buffer;
        this.startValue = startValue;
        this.amount = amount;
    }

    @Override
    public void generate() {
        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            array[i] = startValue + i;
        }
        ITask newTask = new Task(array);
        buffer.addElementInBuffer(newTask);
    }

    public SimpleTaskGenerator withStartValue(int startValue) {
        this.startValue = startValue;
        return this;
    }

    public SimpleTaskGenerator withAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Field amount can't be smaller than 0");
        }
        this.amount = amount;
        return this;
    }
}
