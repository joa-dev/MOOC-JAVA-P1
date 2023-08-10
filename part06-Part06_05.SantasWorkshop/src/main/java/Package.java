
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
public class Package {
    private ArrayList<Gift> giftList;
    
    public Package() {
        this.giftList = new ArrayList<Gift>();
    }
    
    public void addGift(Gift gift) {
        this.giftList.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for (Gift gift : giftList) {
            total += gift.getWeight();
        }
        return total;
    }
    
}
