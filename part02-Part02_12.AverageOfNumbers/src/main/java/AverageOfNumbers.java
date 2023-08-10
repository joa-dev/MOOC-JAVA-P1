
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numbers = 0;
        int sum = 0;
        double avg = 0;
        
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
        
        avg = sum / numbers;
        
        System.out.println("Average of the numbers: "  + avg);
    }
}
