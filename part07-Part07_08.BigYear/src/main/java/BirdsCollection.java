
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class BirdsCollection {
    private ArrayList<Bird> birds;
    
    public BirdsCollection() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void add(Bird bird) {
        birds.add(bird);
    }
    
    public void observed(String name) {
        boolean flag = false;
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                bird.observed();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Not a bird!");
        }
    }
    
    public void print() {
        for (Bird b: birds) {
            System.out.println(b);
        }
    }
    
    public void printOne(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                break;
            }
        }
    }
}
