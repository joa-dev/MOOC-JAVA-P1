
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();

        //The exercise says "THEN prompts the user for the name of a team"
        //Idk if it is wrong or I misunderstood it
        //The easiest solution for me, is put it here, before the try - catch
        
        System.out.println("Team:");
        String team = scan.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;

        try ( Scanner scanFile = new Scanner(Paths.get(fileName))) {
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                if (line.isEmpty()) {
                    continue;
                } else {
                    String[] temp = line.split(",");
                    if (team.equals(temp[0])) {
                        count++;
                        if (Integer.parseInt(temp[2]) > Integer.parseInt(temp[3])) {
                            wins++;
                        } else if (Integer.parseInt(temp[2]) < Integer.parseInt(temp[3])) {
                            losses++;
                        }
                    } else if (team.equals(temp[1])) {
                        count++;
                        if (Integer.parseInt(temp[2]) > Integer.parseInt(temp[3])) {
                            losses++;
                        } else if (Integer.parseInt(temp[2]) < Integer.parseInt(temp[3])) {
                            wins++;
                        }
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
