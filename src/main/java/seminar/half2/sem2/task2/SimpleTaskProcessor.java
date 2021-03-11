package seminar.half2.sem2.task2;

import seminar.half2.sem2.task1.Data;
import seminar.half2.sem2.task2.iface.IBuffer;
import seminar.half2.sem2.task2.iface.ITask;
import seminar.half2.sem2.task2.iface.ITaskProcessor;

public class SimpleTaskProcessor implements ITaskProcessor {
    private IBuffer<ITask> buffer;

    public SimpleTaskProcessor(IBuffer<ITask> buffer) {
        if (buffer == null || buffer.isEmpty()) {
            throw new NullPointerException("Buffer direction to null or empty");
        }
        this.buffer = buffer;
    }

    @Override
    public Integer processor(ITask task) {
        if (buffer.isEmpty()) {
            return null;
        }

        Integer result = 0;
        for (Integer item : buffer.popElementFromBuffer().getData()) {
            result += item;
        }
        return result;
    }
}
