package seminar.sem1;


public class ArrayService {
//    Сумма положительных чисел массива
    public static int getSumPositiveElements(int[] array) {
        int sum = 0;
        for (int item : array) {
            if (item > 0) {
                sum += item;
            }
        }
        return sum;
    }

//    Сдивнуть элементы массива
    public static int[] shiftArray(int[] array) {
        int buffer = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i++) {
            array[i] = array[i - 1];
        }
        array[0] = buffer;
        return array;
    }

    public static int maximum(int[] array, int element) {
        int counter = 0;
        for (int elem : array) {
            if (elem == element) {
                counter++;
            }
        }
        return counter;
    }

    public static int maximum(int[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("");
        }
        int max = Integer.MIN_VALUE;
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public static boolean allElementsPositive(int[] array) throws NullPointerException {
        for (int elem : array) {
            if (elem <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arrayCompare(int[] array1, int[] array2) throws NullPointerException {
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