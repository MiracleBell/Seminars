package seminar.half2.sem2.task2;

import seminar.half2.sem2.task2.iface.IBuffer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class SimpleBuffer<T> implements IBuffer<T> {
    private Queue<T> queue;


    public SimpleBuffer() {
        this.queue = new LinkedBlockingQueue<>();
    }

    @Override
    public void addElementInBuffer(T element) {
        if (element == null) {
            throw new NullPointerException("Element direction to null");
        }
        queue.add(element);
    }

    @Override
    public T popElementFromBuffer() {
        if (isEmpty()){
            throw new NullPointerException("Buffer is empty!");
        }
        return queue.poll();
    }

    @Override
    public int elementsInBuffer() {
        return queue.size();
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
