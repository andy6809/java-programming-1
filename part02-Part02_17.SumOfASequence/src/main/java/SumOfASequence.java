
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number?");
        int m1 = Integer.valueOf(scanner.nextLine());
        int count = 0;
        for (int i=1; i <= m1; i++) {
            count = count + i;
        }
        System.out.println("The sum is " + count);
    }
}
