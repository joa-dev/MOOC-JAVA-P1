
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
public class Hold {

    private ArrayList<Suitcase> hold;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weightOfHold = 0;
        for (Suitcase e : this.hold) {
            weightOfHold += e.totalWeight();
        }
        if (maxWeight >= weightOfHold + suitcase.totalWeight()) {
            this.hold.add(suitcase);
        }

    }

    public String toString() {
        int weightOfHold = 0;
        int suitcasesInHold = 0;
        for (Suitcase e : this.hold) {
            weightOfHold += e.totalWeight();
            suitcasesInHold++;
        }
        return suitcasesInHold + " suitcases (" + weightOfHold + " kg)";
    }

    public void printItems() {
        for (Suitcase e : this.hold) {
            e.printItems();
        }
    }
}
