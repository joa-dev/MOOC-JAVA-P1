
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

    public void start(Scanner scan) {
        BirdingBook book = new BirdingBook();

        while (true) {
            System.out.println("?");

            String command = scan.nextLine();

            if (command.equals("Add")) {
                book.add(scan);
            } else if (command.equals("Observation")) {
                book.observation(scan);
            } else if (command.equals("All")) {
                System.out.println(book.toString());
            } else if (command.equals("One")) {
                System.out.println(book.one(scan));
            } else if (command.equals("Quit")) {
                break;
            } else {
                continue;
            }
        }

    }
}
