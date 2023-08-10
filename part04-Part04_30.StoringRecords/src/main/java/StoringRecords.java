
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(line.isEmpty()){
                    continue;
                } else {
                    String[] temp = line.split(",");
                    int age = Integer.valueOf(temp[1]);
                    persons.add(new Person(temp[0], age));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        // and printing the read records
        return persons;
    }
}
