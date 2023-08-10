
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> text = new ArrayList<>();
        int count = 0;
        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                System.out.println(count);
                break;
            }
            
            text.add(input);
            count++;
        }
        
    }
}
