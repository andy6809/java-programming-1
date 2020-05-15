
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1 = Integer.valueOf(scan.nextLine());
        if (m1 % 400 != 0 && m1 % 100 == 0) {
            System.out.print("The year is not a leap year.");
        } else if (m1 % 4 == 0) {
            System.out.print("The year is a leap year.");
        } else {
            System.out.print("The year is not a leap year.");
        }

    }
}
