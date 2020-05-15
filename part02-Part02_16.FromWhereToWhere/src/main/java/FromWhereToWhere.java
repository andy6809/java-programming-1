
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int m1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int m2 = Integer.valueOf(scanner.nextLine());
        if (m1 >= m2) {
            for (int i = m2; i <= m1; i++) {
                System.out.println(i);
            }
        }
    }
}