
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int weight) {
        this.maxWeight = weight;
        this.items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item i: items) {
            totalWeight = totalWeight + i.getWeight();
        }
        if (totalWeight + item.getWeight() <= maxWeight)
            items.add(item);
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item i: items) {
            totalWeight = totalWeight + i.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()) {
            return null;
        }
        int max = items.get(0).getWeight();
        Item maxI = items.get(0);
        for(Item i: items) {
            if (i.getWeight() > max) {
                max = i.getWeight();
                maxI = i;
            }
        }
        return maxI;
        
    }
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0kg)";
        } 
        if (items.size() == 1) {
            return "1 item " + "(" + totalWeight() + " kg)";
        }
        return items.size() + " items " + "(" + totalWeight() + " kg)";
    }
}
