
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOldest = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                int age = Integer.valueOf(input.split(",")[1]);
                String name = input.split(",")[0];
                if (oldest < age) {
                    oldest = age;
                    nameOldest = name;
                }
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
