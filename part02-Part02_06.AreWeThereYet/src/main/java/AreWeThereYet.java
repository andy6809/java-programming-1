
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int m1 = Integer.valueOf(scanner.nextLine());
        while (m1 != 4) {
            System.out.println("Give a number:");
            m1 = Integer.valueOf(scanner.nextLine());
        }

    }
}
