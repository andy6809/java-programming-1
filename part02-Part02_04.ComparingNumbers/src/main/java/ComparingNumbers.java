
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = Integer.valueOf(scanner.nextLine());
        int m2 = Integer.valueOf(scanner.nextLine());
        if (m1 < m2) {
            System.out.println(m1 + " is smaller2 than " + m2);
        } else if (m1 > m2) {
            System.out.println(m1 + " is greater than " + m2);
        } else {
            System.out.println(m1 + " is equal to " + m2);
        }

    }
}
