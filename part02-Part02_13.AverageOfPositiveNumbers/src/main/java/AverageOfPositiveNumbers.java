
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number = 0;
        double sum = 0;
        double avg = 0;
        
        while(true){
            int temp = Integer.valueOf(scanner.nextLine());
            
            if(temp > 0){
                number++;
                sum += temp;
                continue;
            } else if (temp == 0){
                break;
            } else {
                continue;
            }
        }
        if (sum == 0){
            System.out.println("Cannot calculate the average");
        } else {
            avg = sum / number;
            System.out.println(avg);
        }
    }
}
