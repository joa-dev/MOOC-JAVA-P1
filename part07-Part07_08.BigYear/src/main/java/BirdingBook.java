
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
public class BirdingBook {

    private ArrayList<Bird> book;

    public BirdingBook() {
        this.book = new ArrayList<Bird>();
    }

    public void add(Scanner scan) {
        System.out.println("Name: ");

        String name = scan.nextLine();

        for (Bird bird : book) {
            if (bird.getName().equals(name)) {
                System.out.println("Bird already added");
                return;
            }
        }

        System.out.println("Name in Latin: ");

        String nameLatin = scan.nextLine();

        this.book.add(new Bird(name, nameLatin));
    }

    public void observation(Scanner scan) {
        System.out.println("Bird?");
        String name = scan.nextLine();
        boolean trueIfDone = false;
        for (Bird bird : book) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                trueIfDone = true;
            }
        }
        if (trueIfDone == false) {
            System.out.println("Not a bird!");
        }
    }

    public String one(Scanner scan) {
        System.out.println("Bird?");
        String name = scan.nextLine();
        String temp = "";
        for (Bird bird : book) {
            if (bird.getName().equals(name)) {
                temp = bird.toString();
            }
        }
        return temp;
    }

    public String toString() {
        String temp = "";
        for (Bird bird : book) {
            temp += bird.toString() + "\n";
        }
        return temp;
    }
}
