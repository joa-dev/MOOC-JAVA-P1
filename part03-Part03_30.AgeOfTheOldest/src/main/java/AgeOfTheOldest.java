
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            } else {
                String[] array = text.split(",");
                if (number < Integer.valueOf(array[1])){
                    number = Integer.valueOf(array[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + number);
    }
}
