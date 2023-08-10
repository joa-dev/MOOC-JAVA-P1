
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        
        //Weird error, I needed to change the original code from:
        //System.out.print to System.out.println
        //because there wasn't any output from the console
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                int number = Integer.valueOf(fileScanner.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
