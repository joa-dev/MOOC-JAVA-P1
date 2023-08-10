
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        stats.reader();

        System.out.println("Point average (all): " + stats.averageAll());

        System.out.println("Point average (passing): " + stats.averagePassing());
        
        System.out.println("Pass percentage: " + stats.passPercentage());
        
        System.out.println("Grade distribution:\n" + stats.gradeDist());
    }
}
