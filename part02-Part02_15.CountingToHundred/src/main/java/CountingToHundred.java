
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        for(number = number; number <= 100; number++){
            System.out.println(number);
        } 
    }
}
