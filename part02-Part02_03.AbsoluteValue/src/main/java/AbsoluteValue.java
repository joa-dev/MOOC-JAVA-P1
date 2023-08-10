
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        int res = number < 0 ? number * -1 : number;
        
        System.out.println(res);
    }
}
