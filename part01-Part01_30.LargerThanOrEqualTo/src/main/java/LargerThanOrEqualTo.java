
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int m1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int m2 = Integer.valueOf(scan.nextLine());
        if (m1 > m2) {
            System.out.println("Greater number is: " + m1);
        } else if (m1 < m2) {
            System.out.println("Greater number is: " + m2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
