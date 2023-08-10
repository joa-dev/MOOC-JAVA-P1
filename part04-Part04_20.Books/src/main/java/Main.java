
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            library.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        for (Book x : library) {
            if (input.equals("everything")) {
                System.out.println(x.printEverything());
            } else if (input.equals("name")) {
                System.out.println(x.printName());
            }
        }

    }
}
