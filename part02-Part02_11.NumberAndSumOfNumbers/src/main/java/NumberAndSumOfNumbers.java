
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num != 0){
                numbers++;
                sum += num;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: "  + numbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
