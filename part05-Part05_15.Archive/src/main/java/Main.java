
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String m1 = scanner.nextLine();
            if (m1.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String m2 = scanner.nextLine();
            if (m2.isEmpty()) {
                break;
            }
            if (!(lista2.contains(m1)))
                lista.add(m1 + ": " + m2);
                lista2.add(m1);
            
        }
        for (String i: lista) {
            System.out.println(i);
        }
        

    }
}
