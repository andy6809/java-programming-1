
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int m2 = Integer.valueOf(scanner.nextLine());
        int prod = 1;
        for (int i=1; i <= m2; i++) {
            prod = prod * i;
        }
        if (m2 == 0) {
            prod = 1;
        }
        System.out.println("The sum is " + prod);

    }
}
