/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class Container {
    private int liquidQuantity;
    
    public Container() {
        this.liquidQuantity = 0;
    }
    
    public int contains() {
        return liquidQuantity;
    }
    
    public void setQuantity(int amount) {
        this.liquidQuantity = amount;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.liquidQuantity += amount;
        }
        if (this.liquidQuantity > 100) {
            this.liquidQuantity = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.liquidQuantity -= amount;
        }
        if (this.liquidQuantity < 0) {
            this.liquidQuantity = 0;
        }
    }

    public String toString() {
        return liquidQuantity + "/100";
    }
}
