/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

/**
 *
 * @author joa-dev
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }
    
    public String getId() {
        return identifier;
    }
    
    @Override
    public String toString(){
        return identifier + ": " + name;
    }
}