package seminar.d1;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayService {
    public int getSumPositiveElements(int[] array) {
        int sum = 0;
        for (int iter : array) {
            if (iter > 0) {
                sum += iter;
            }
        }
        return sum;
    }

    public int[] shiftArray(int[] array) {
        int buffer = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i++) {
            array[i] = array[i - 1];
        }
        array[0] = buffer;
        return array;
    }

    public int fibonachiValue(int count) {
        if (count <= 1) {
            return 1;
        } else {
            return count * fibonachiValue(count - 1);
        }
    }

    public int maximum(int[] array, int element) {
        int counter = 0;
        for (int iter : array) {
            if (iter == element) {
                counter++;
            }
        }
        return counter;
    }

    public int maximum(int[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("");
        }
        int max = Integer.MIN_VALUE;
        for (int iter : array) {
            if (iter > max) {
                max = iter;
            }
        }
        return max;
    }

    public boolean allElementsPositive(int[] array) throws NullPointerException {
        for (int iter : array) {
            if (iter <= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean arrayCompare(int[] array1, int[] array2) throws NullPointerException {
        if (array1 == null || array2 == null) {
            throw new NullPointerException("");
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}