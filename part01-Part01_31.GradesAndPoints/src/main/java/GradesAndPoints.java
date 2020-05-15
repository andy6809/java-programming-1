
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int m1 = Integer.valueOf(scan.nextLine());
        if (m1 < 0) {
            System.out.println("impossible!");
        } else if (m1 < 50) {
            System.out.println("Grade: failed");
        } else if (m1 < 60) {
            System.out.println("Grade: 1");
        } else if (m1 < 70) {
            System.out.println("Grade: 2");
        } else if (m1 < 80) {
            System.out.println("Grade: 3");
        } else if (m1 < 90) {
            System.out.println("Grade: 4");
        } else if (m1 <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }

    }
}
