
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class RecipeBook {

    private ArrayList<Recipe> book;

    public RecipeBook(String file) {
        this.book = new ArrayList<Recipe>();
        readFile(file);
    }

    public void readFile(String file) {
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            String name = "";
            int cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<String>();
            int counter = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if ((line.trim().isEmpty() || !fileScanner.hasNextLine()) && counter != 0) {
                    ArrayList<String> temp = new ArrayList<String>();
                    temp.addAll(ingredients);
                    book.add(new Recipe(name, cookingTime, temp));
                    name = "";
                    cookingTime = 0;
                    ingredients.clear();
                    counter = 0;
                } else if (counter == 0) {
                    name = line;
                    counter++;
                } else if (counter == 1) {
                    cookingTime = Integer.valueOf(line);
                    counter++;
                } else if (counter == 2) {
                    ingredients.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public String toString() {
        String temp = "";
        for (Recipe r : book) {
            temp += r.toString() + "\n";
        }
        return temp;
    }

    public void findName(Scanner scanner) {
        System.out.println("Searched word: ");

        String word = scanner.nextLine();

        System.out.println("Recipes:");

        for (Recipe r : book) {
            if (r.getName().contains(word)) {
                System.out.println(r.toString());
            }
        }
    }

    public void findCookingTime(Scanner scanner) {
        System.out.println("Max cooking time: ");

        int time = Integer.valueOf(scanner.nextLine());

        System.out.println("Recipes:");

        for (Recipe r : book) {
            if (r.getCookingTime() <= time) {
                System.out.println(r.toString());
            }
        }
    }

    public void findIngredient(Scanner scanner) {
        System.out.println("Ingredient: ");

        String ingredient = scanner.nextLine();

        System.out.println("Recipes:");

        for (Recipe r : book) {
            for (String ing : r.getIngredients()) {
                if (ing.equals(ingredient)) {
                    System.out.println(r.toString());
                }
            }
        }
    }
}
