
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String m1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String m2 = scan.nextLine();
        if (m1.equals(m2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
