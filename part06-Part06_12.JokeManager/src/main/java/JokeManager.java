
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class JokeManager {
    private ArrayList<String> jokesList;
    
    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        jokesList.add(joke);
    }
    
    public String drawJoke() {
        if (jokesList.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokesList.size());
            return jokesList.get(index);
        }  
    }
    
    public void printJokes() {
        for (String joke: jokesList) {
            System.out.println(joke);
        }
    }
}
