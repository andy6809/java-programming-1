
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        BirdsCollection birds = new BirdsCollection();
        while (true) {
            System.out.print("? ");
            String m1 = scan.nextLine();
            if (m1.equals("Quit")) {
                break;
            }
            else if (m1.equals("Add")) {
                System.out.print("Name: ");
                String m2 = scan.nextLine();
                System.out.print("Name in Latin: ");
                String m3 = scan.nextLine();
                birds.add(new Bird(m2, m3));
            } else if (m1.equals("Observation")) {
                System.out.print("Bird? ");
                String m4 = scan.nextLine();
                birds.observed(m4);
            } else if (m1.equals("All")) {
                birds.print();
            } else if (m1.equals("One")) {
                System.out.print("Bird? ");
                String m5 = scan.nextLine();
                birds.printOne(m5);
            }
        }
    }

}
