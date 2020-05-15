
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int m1 = Integer.valueOf(scanner.nextLine());
            if (m1 == 0) {
                break;
            } else if (m1 < 0) {
                count = count + 1;
            } else {
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + count);

    }
}
