
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String m1 = scan.nextLine();
        System.out.println("Give an integer:");
        int m2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double m3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean m4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + m1);
        System.out.println("You gave the integer " + m2);
        System.out.println("You gave the double " + m3);
        System.out.println("You gave the boolean " + m4);

    }
}
