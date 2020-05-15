
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String m1 = scanner.nextLine();
            if (m1.equals("")) {
                break;
            } else {
                String[] pieces = m1.split(" ");
                for (String i: pieces) {
                    if (i.contains("av"))
                        System.out.println(i);
                }
            }
        }
    }
}
