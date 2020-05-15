
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        System.out.print("From where? ");
        int m1 = Integer.valueOf(scanner.nextLine());
        System.out.print("To where? ");
        int m2 = Integer.valueOf(scanner.nextLine());
        for (int i = m1; i <= m2; i++){
            System.out.println(numbers.get(i));
        }

    }
}
