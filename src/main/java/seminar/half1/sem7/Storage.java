package seminar.half1.sem7;

public interface Storage<T> {
    void add(T elm) throws StorageException;

    void remove(T elem) throws StorageException;

    int size();
}
