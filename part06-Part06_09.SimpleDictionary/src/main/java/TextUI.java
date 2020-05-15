
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
public class TextUI {
    private Scanner scan;
    private SimpleDictionary dicto;
    
    public TextUI(Scanner scan, SimpleDictionary dicto) {
        this.scan = scan;
        this.dicto = dicto;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String sc1 = scan.nextLine();
            if (sc1.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (sc1.equals("add")) {
                System.out.print("Word: ");
                String sc2 = scan.nextLine();
                System.out.print("Translation: ");
                String sc3 = scan.nextLine();
                dicto.add(sc2, sc3);
            } else if (sc1.equals("search")) {
                System.out.print("To be translated: ");
                String sc4 = scan.nextLine();
                if (dicto.translate(sc4) == null) {
                    System.out.println("Word " + sc4 + " was not found");
                } else {
                    System.out.print("Translation: " + dicto.translate(sc4));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
