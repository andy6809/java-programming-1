
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int m1 = Integer.valueOf(scanner.nextLine());
            if (m1 == 0) {
                break;
            } else{
                count = count + 1;
                sum = sum + m1;
            } 
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}
