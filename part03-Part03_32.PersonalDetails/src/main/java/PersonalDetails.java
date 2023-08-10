
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int howManyLetters = 0;
        String name = "";
        int count = 0;
        double sum = 0;
        double avg = 0;
        
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            } else {
                String[] array = text.split(",");
                
                sum += Integer.valueOf(array[1]);
                
                count++;
                
                if(howManyLetters < array[0].length()){
                    name = array[0];
                    howManyLetters = array[0].length();
                }
            }
        }
        
        avg = sum / count;
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);
    }
}
