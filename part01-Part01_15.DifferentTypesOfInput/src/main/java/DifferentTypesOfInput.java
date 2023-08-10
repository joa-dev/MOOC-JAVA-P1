
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String first = scan.nextLine();
        System.out.println("Give an integer:");
        int second = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double third = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean fourth = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + first);
        System.out.println("You gave the integer " + second);
        System.out.println("You gave the double " + third);
        System.out.println("You gave the boolean " + fourth);
    }
}
