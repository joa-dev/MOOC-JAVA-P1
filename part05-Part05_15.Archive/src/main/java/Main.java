
import Item.Item;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            //Odd solution
            
            boolean duplicateCheck = false;
                       
            for (Item li : list) {
                if (li.getId().equals(identifier)) {
                    duplicateCheck = true;
                }
            }
            
            if(duplicateCheck){
                continue;
            }
            
            //This was a real odd solution, maybe I should have used 
            //a custom equals method in Item.java and use list.contains() here
            //But, I still think this is easier than writing another equals method
            
            list.add(new Item(identifier, name));
        }

        System.out.println("==Items==");

        for (Item li : list) {
            System.out.println(li.toString());
        }
    }
}
