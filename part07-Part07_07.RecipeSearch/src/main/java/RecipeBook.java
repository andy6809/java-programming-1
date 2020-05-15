
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class RecipeBook {
    private ArrayList<Recipe> recipeList;
    
    public RecipeBook() {
        this.recipeList = new ArrayList<Recipe>();
    }
    
    public void add(Recipe recipe) {
        recipeList.add(recipe);
    }
    
    public void print() {
        for (Recipe recipe: recipeList) {
            System.out.println(recipe);
        }
    }
    
    public void printIngredients() {
        for (Recipe recipe: recipeList) {
            recipe.getIngredients();
        }
    }
    
    public void findByName(String name) {
        for(Recipe recipe: recipeList) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByTime(int maxTime) {
        for(Recipe recipe: recipeList) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String ingredient) {
        for(Recipe recipe: recipeList) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println("Recipes:");
                System.out.println(recipe);
            }
        }
    }
}
