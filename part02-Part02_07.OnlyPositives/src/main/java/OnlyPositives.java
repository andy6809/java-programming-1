
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int m1 = Integer.valueOf(scanner.nextLine());
            if (m1 == 0) {
                break;
            } else if (m1 < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(m1 * m1);
            }
            
        }

    }
}
