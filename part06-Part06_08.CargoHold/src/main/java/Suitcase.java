
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.maxWeight >= item.getWeight() + this.totalWeight()) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public String toString() {
        int numberOfItems = 0;
        for (Item item : items) {
            numberOfItems++;
        }
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (numberOfItems == 1) {
            return numberOfItems + " item (" + totalWeight() + " kg)";
        } else {
            return numberOfItems + " items (" + totalWeight() + " kg)";
        }
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        } else {
            Item heaviest = items.get(0);
            
            for (Item item : items) {
                if (heaviest.getWeight() < item.getWeight()) {
                    heaviest = item;
                }
            }
            return heaviest;
        }
    }
    
    public ArrayList itemsArray() {
        return this.items;
    }
}
