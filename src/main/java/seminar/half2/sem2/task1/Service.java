package seminar.half2.sem2.task1;

import java.util.*;

public class Service {
    public static Collection<Data> getDataEqualsName(List<Data> dataList, String name) {
        if (dataList == null) {
            throw new NullPointerException("dataList direction to null");
        }
        if (name == null) {
            throw new NullPointerException("name direction to null");
        }
        Collection<Data> resultCollection = new ArrayList<>();

        for (Data item : dataList) {
            if (item.getName().equals(name)) {
                resultCollection.add(item);
            }
        }

        return resultCollection;
    }

    public static Collection<Data> getSmallerThanLevel(List<Data> dataList, double level) {
        if (dataList == null) {
            throw new NullPointerException("dataList direction to null");
        }

        Collection<Data> resultList = new ArrayList<>();

        for (Data item : dataList) {
            if (Double.compare(item.getValue(), level) <= 0) {
                resultList.add(item);
            }
        }
        return resultList;
    }

    public static Collection<Data> getObjects(List<Data> dataList, Set<String> names) {
        if (dataList == null) {
            throw new NullPointerException("dataList direction to null");
        }
        if (names == null) {
            throw new NullPointerException("names direction to null");
        }

        Collection<Data> resultList = new ArrayList<>();

        for (Data item : dataList) {
            if (names.contains(item)) {
                resultList.add(item);
            }
        }
        return resultList;
    }

    public static String[] getPositiveData(List<Data> dataList) {
        if (dataList == null) {
            throw new NullPointerException("dataList direction to null");
        }

        Set<String> resultSet = new HashSet<>();

        for (Data item : dataList) {
            if (item.getValue() > 0) {
                resultSet.add(item.getName());
            }
        }
        return new String[1];
//        return resultSet.toArray();
    }

    public static <T> Collection<T> getMergedSets(List<Set<T>> listOfSet) {
        if (listOfSet == null) {
            throw new NullPointerException("ListOfSet direction to null");
        }
        Collection<T> resultSet = new HashSet<>();

        for (Set<T> item : listOfSet) {
            resultSet.addAll(item);
        }
        return resultSet;
    }

    public static <T> Collection<T> getCrossingSets(List<Set<T>> listOfSet) {
        if (listOfSet == null) {
            throw new NullPointerException("ListOfSet direction to null");
        }
        Collection<T> resultSet = getMergedSets(listOfSet);

        for (Set<T> item : listOfSet) {
            for (T elem : item) {
                for (Set<T> s : listOfSet) {
                    if (!s.contains(elem)) {
                        continue;
                    }
                }
                resultSet.add(elem);
            }
        }

        /*for (T elem : resultSet) {
            for (Set<T> set : listOfSet) {
                if (!set.contains(elem)) {
                    resultSet.remove(elem);
                }
            }
        }*/
        return resultSet;
    }

    public static <T> List<Set<T>> getSetWithMaxSize(List<Set<T>> listOfSet) {
        if (listOfSet == null) {
            throw new NullPointerException("ListOfSet direction to null");
        }

        List<Set<T>> resultList = new ArrayList<>();
        int maxSize = 0;
        for (Set<T> item : listOfSet) {
            if (item == null) {
                continue;
            }

            if (item.size() > maxSize) {
                resultList.clear();
                maxSize = item.size();
            }
            if (maxSize == item.size()) {
                resultList.add(item);
            }
        }

        return resultList;
    }
}
