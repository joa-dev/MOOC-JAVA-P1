
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nameOldest = "";
        int numberOldest = 0;
        
        while(true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            } else {
                String[] array = text.split(",");
                if(numberOldest < Integer.valueOf(array[1])){
                    nameOldest = array[0];
                    numberOldest = Integer.valueOf(array[1]);
                }
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
