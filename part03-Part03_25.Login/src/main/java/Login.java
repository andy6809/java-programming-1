
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String m1 = scanner.nextLine();
        System.out.print("Enter password: ");
        String m2 = scanner.nextLine();
        String name = m1 + " " + m2;
        if (name.equals("alex sunshine") || name.equals("emma haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
