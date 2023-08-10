/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class Container {
    int liquid;
    
    public Container() {
        this.liquid = 0;
    }
    public int contains() {
        return liquid;
    }
    
    public void add(int amount) {
        if (this.liquid + amount <= 100 && amount > 0) {
            this.liquid += amount;
        } else if (this.liquid + amount > 100) {
            this.liquid = 100;
        }
    }
    
    public void remove(int amount) {
        if (this.liquid - amount >= 0 && amount > 0) {
            this.liquid -= amount;
        } else if (this.liquid - amount <= 0 && amount > 0) {
            this.liquid = 0;
        }
    }
    
    public String toString() {
        return this.liquid + "/100";
    }
}
