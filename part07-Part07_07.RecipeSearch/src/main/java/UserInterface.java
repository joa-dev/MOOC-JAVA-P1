
import java.util.ArrayList;
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
public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("File to read: ");

        String file = scanner.nextLine();

        RecipeBook book = new RecipeBook(file);

        list();

        while (true) {
            System.out.println("Enter command: ");

            String command = scanner.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                commandList(book);
            } else if (command.equals("find name")) {
                book.findName(scanner);
            } else if (command.equals("find cooking time")) {
                book.findCookingTime(scanner);
            } else if (command.equals("find ingredient")) {
                book.findIngredient(scanner);
            }
        }

    }

    public void list() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    public void commandList(RecipeBook book) {
        System.out.println(book.toString());
    }

}
