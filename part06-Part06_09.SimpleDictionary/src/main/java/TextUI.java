
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpledictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpledictionary) {
        this.scanner = scanner;
        this.simpledictionary = simpledictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            String translation = "";
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word:");
                input = scanner.nextLine();
                System.out.println("Translation:");
                translation = scanner.nextLine();
                simpledictionary.add(input, translation);
                continue;
            } else if (input.equals("search")) {
                System.out.println("Word:");
                input = scanner.nextLine();
                if(simpledictionary.translate(input) == null) {
                    System.out.println("Word " + input + " was not found");
                } else {
                    System.out.println(simpledictionary.translate(input));
                }
                continue;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
