
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
public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        return this.room.isEmpty() ? true : false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }

        String namest = room.get(0).getName();
        int shortest = room.get(0).getHeight();

        for (Person person : room) {
            if (shortest > person.getHeight()) {
                namest = person.getName();
                shortest = person.getHeight();
            }
        }
        return new Person(namest, shortest);

    }

    public Person take() {
        Person toTake = shortest();

        if (toTake == null) {
            return null;
        }

        room.remove(toTake);

        return toTake;
    }
}
