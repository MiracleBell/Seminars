package seminar.half2.sem2.task2.iface;

public interface IBuffer<T> {
    void addElementInBuffer(T element);

    T popElementFromBuffer();

    int elementsInBuffer();

    void clear();

    boolean isEmpty();
}
