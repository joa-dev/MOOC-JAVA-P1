
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // indices:      0  1  2  3  4
        // indices:       0  1  2  3   4
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int value = array[0];

        for (int x : array) {
            if (value > x) {
                value = x;
            }
        }
        return value;
    }

    public static int indexOfSmallest(int[] array) {
        int value = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (value > array[i]) {
                value = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int value = array[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (value > array[i]) {
                value = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
        //
        System.out.println(Arrays.toString(array));
        
    }
}