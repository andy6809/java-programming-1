
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
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty())
            return null;
        int min = persons.get(0).getHeight();
        Person minP = persons.get(0);
        for(Person p: persons) {
            if (p.getHeight() < min) {
                min = p.getHeight();
                minP = p;
            }
        }
        return minP;
        
    }
    
    public Person take() {
        if (persons.isEmpty())
            return null;
        Person shortest = this.shortest();
        persons.remove(this.shortest());
        return shortest;
    }
    
}
