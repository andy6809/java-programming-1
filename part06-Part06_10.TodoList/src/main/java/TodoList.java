
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
public class TodoList {
    private ArrayList<String> lista;
    
    public TodoList() {
        this.lista = new ArrayList<>();
    }
    
    public void add(String task) {
        lista.add(task);
    }
    
    public void print() {
        int count = 1;
        for (String t: lista) {
            System.out.println(count + ": " + t);
            count++;
        }
    }
    
    public void remove(int number) {
        lista.remove(number - 1);
    }
}
