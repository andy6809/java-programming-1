
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String m1 = scanner.nextLine();
            if (m1.equals("end")) {
                break;
            };
            count++;
        }
        System.out.println(count);

    }
}
