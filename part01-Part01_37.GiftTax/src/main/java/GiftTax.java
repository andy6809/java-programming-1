
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int m1 = Integer.valueOf(scan.nextLine());
        if (m1 < 5000) {
            System.out.println("No tax!");
        } else if (m1 < 25000) {
            System.out.println("Tax: " + Double.valueOf((m1 - 5000) * 0.08 + 100));
        } else if (m1 < 55000) {
            System.out.println("Tax: " + Double.valueOf((m1 - 25000) * 0.1 + 1700));
        } else if (m1 < 200000) {
            System.out.println("Tax: " + Double.valueOf((m1 - 55000) * 0.12 + 4700));
        } else if (m1 < 1000000) {
            System.out.println("Tax: " + Double.valueOf((m1 - 200000) * 0.15 + 22100));
        } else {
            System.out.println("Tax: " + Double.valueOf((m1 - 1000000) * 0.17 + 142100));
        }

    }
}
