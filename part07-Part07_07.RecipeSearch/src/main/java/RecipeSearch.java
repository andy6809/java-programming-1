
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeCollection = new RecipeBook();
        
        System.out.print("File to read: ");
        String m1 = scanner.nextLine();
        readFile(recipeCollection, m1);
        System.out.println("Commands:" + "\n" +
                "list - lists the recipes" + "\n" +
                "stop - stops the program" + "\n" +
                "find name - searches recipes by name" + "\n" +
                "find cooking time - searches recipes by cooking time" + "\n" +
                "find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.print("Enter command: ");

            String m2 = scanner.nextLine();
            
            if (m2.equals("list")) {
                System.out.println("Recipes:");
                recipeCollection.print();
            } else if (m2.equals("stop")) {
                break;
            } else if (m2.equals("find name")) {
                System.out.print("Searched word: ");
                String m3 = scanner.nextLine();
                System.out.println("Recipes:");
                recipeCollection.findByName(m3);
            } else if (m2.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int m4 = Integer.valueOf(scanner.nextLine());
                recipeCollection.findByTime(m4);
            } else if (m2.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String m5 = scanner.nextLine();
                recipeCollection.findByIngredient(m5);
            }
        }
    }
    
    public static void readFile(RecipeBook recipeCollection, String m1) {
        try (Scanner scanFile = new Scanner(Paths.get(m1))) {
            String recipeName = "";
            int cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            int position = 0;
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                if (line.isEmpty()){
                    ArrayList<String> ingredients2 = (ArrayList<String>)ingredients.clone();
                    Recipe recipe = new Recipe(recipeName, cookingTime, ingredients2);
                    recipeCollection.add(recipe);
                    position = 0;
                    ingredients.clear();
                } else if (position == 0) {
                    recipeName = line;
                    position++;
                } else if (position == 1) {
                    cookingTime = Integer.valueOf(line);
                    position++;
                }
                else {
                    ingredients.add(line);
                }
            }
            Recipe recipe = new Recipe(recipeName, cookingTime, ingredients);
            recipeCollection.add(recipe);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
