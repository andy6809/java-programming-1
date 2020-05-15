
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Carry on?");
        String m1 = scanner.nextLine();
        while (!m1.equals("no")) {
            System.out.println("Carry on?");
            m1 = scanner.nextLine();
        }

    }
}
