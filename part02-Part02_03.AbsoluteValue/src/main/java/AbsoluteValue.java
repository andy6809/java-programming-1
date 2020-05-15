
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = Integer.valueOf(scanner.nextLine());
        if (m1 < 0) {
            System.out.println(m1 * -1);
        } else {
            System.out.println(m1);
        }
        

    }
}
