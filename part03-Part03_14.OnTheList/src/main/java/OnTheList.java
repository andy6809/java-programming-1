
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String m1 = scanner.nextLine();
        Boolean if_found = list.contains(m1);
        if (if_found) {
            System.out.println(m1 + " was found!");
        } else {
            System.out.println(m1 + " was not found!");
        }

    }
}
