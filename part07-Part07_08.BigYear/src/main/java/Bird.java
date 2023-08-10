
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
public class Bird {

    private String name;
    private String nameLatin;
    private int observations;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0;
    }

    public void addObservation() {
        observations++;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (" + nameLatin + "): " + observations + " observations";
    }
}
