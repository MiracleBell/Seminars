package seminar.half2.sem2.task2;

import seminar.half2.sem2.task2.iface.ITask;

public class PriorityTask implements ITask, Comparable<PriorityTask> {
    private int[] arrayOfData;
    private int priority;

    public PriorityTask(int[] arrayOfData, int priority) {
        if (arrayOfData == null) {
            throw new NullPointerException("Array direction to null");
        }
        this.arrayOfData = arrayOfData;
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityTask other) {
        return priority - other.priority;
    }

    @Override
    public int[] getData() {
        return arrayOfData;
    }
}
