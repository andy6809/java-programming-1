
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scan;
    
    public UserInterface(TodoList todoList, Scanner scan) {
        this.todoList = todoList;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String sc1 = scan.nextLine();
            if (sc1.equals("stop")) {
                break;
            } else if (sc1.equals("add")) {
                System.out.print("To add: ");
                String sc2 = scan.nextLine();
                todoList.add(sc2);
            } else if (sc1.equals("list")) {
                todoList.print();
            } else if (sc1.equals("remove")) {
                int sc3 = Integer.valueOf(scan.nextLine());
                todoList.remove(sc3);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
