
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int i = 0;
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        
        while (i != -1) {
            i = scanner.nextInt();
            if (i != -1){
                sum += i;
                numbers++;
                if((i % 2) == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else if (i == -1) {
                break;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (sum / (numbers * 1.0)));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
