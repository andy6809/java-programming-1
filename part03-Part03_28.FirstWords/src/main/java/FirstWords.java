
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String m1 = scanner.nextLine();
            if (m1.equals("")) {
                break;
            } else {
                String[] pieces = m1.split(" ");
                System.out.println(pieces[0]);
            }
        }    
    }
}
