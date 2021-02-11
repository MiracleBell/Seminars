package seminar.half1.sem7;

import java.util.ArrayList;
import java.util.List;

public class StorageImpl<T> implements Storage<T> {
    private List<T> storageList;


    public StorageImpl() {
        storageList = new ArrayList<T>();
    }

    public StorageImpl(List<T> storageList) {
        this.storageList = storageList;
    }

    public void add(T elem) throws StorageException {
        if (elem == null) {
            throw new StorageException("Cannot share null to the storage");
        }
        storageList.add(elem);
    }

    public void remove(T elem) {
        storageList.remove(elem);
    }

    public int size() {
        return storageList.size();
    }
}
