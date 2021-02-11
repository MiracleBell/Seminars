package seminar.half1.sem2;

public class ArrayService {
    public static boolean isOrdered(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static int arrayElementsInInterval(double[] array, double a, double b) {
        int counter = 0;

        for (double elem : array) {
            if (elem >= a && elem <= b) {
                counter++;
            }
        }
        return counter;
    }

}
