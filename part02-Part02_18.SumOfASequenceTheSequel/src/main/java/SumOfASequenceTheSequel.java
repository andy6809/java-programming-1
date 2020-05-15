
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number?");
        int m1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number?");
        int m2 = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i=m1; i <= m2; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

    }
}
