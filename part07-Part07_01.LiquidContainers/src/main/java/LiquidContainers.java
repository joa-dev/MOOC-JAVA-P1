//import java.util.ArrayList;

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("> ");

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (first + amount <= 100 && amount > 0) {
                    first += amount;
                } else if (first + amount > 100) {
                    first = 100;
                }

            } else if (command.equals("move")) {
                if (first > 0 && amount > 0 && first >= amount && second < 100) {
                    if (second + amount <= 100) {
                        first -= amount;
                        second += amount;
                    } else if (second + amount > 100) {
                        first -= amount;
                        second = 100;
                    }
                } else if (first < amount) {
                    second += first;
                    first = 0;
                }

            } else if (command.equals("remove")) {
                if (second >= amount) {
                    second -= amount;
                } else if (second < amount) {
                    second = 0;
                }
            }
        }
    }
}
