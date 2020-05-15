
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            int m1 = Integer.valueOf(scanner.nextLine());
            if (m1 == 0) {
                break;
            } else if (m1 > 0) {
                count = count + 1;
                sum = sum + m1;
            } 
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(Double.valueOf(sum) / count);
        }

    }
}
