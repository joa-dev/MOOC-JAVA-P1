
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        //int[] array = {3, 1, 5, 99, 3, 12};
        ArrayList<String> strings = new ArrayList<>();
        strings.add("d");
        strings.add("A");
        strings.add("x");
        strings.add("X");
        strings.add("a");

        System.out.println(strings);

        sortStrings(strings);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings);
    }

}
