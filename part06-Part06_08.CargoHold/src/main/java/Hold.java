
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase s: suitcases) {
            totalWeight = totalWeight + s.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= maxWeight)
            suitcases.add(suitcase);
    }
    
    public void printItems() {
        for (Suitcase s: suitcases) {
            s.printItems();
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        for (Suitcase s: suitcases) {
            totalWeight = totalWeight + s.totalWeight();
        }
        if (suitcases.isEmpty()) {
            return "no suitcases (0kg)";
        } 
        if (suitcases.size() == 1) {
            return "1 suitcase " + "(" + totalWeight + " kg)";
        }
        return suitcases.size() + " suitcases " + "(" + totalWeight + " kg)";
    }
    
}
