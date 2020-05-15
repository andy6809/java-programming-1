
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String nameLongest = "";
        int sumYear = 0;
        int countRows = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                int year = Integer.valueOf(input.split(",")[1]);
                int nameLength = Integer.valueOf(input.split(",")[0].length());
                countRows++;
                sumYear = sumYear + year;
                if (longest < nameLength) {
                    longest = nameLength;
                    nameLongest = input.split(",")[0];
                }
            }
        }
        System.out.println("Longest name:" + nameLongest);
        System.out.println("Average of the birth years: " + (Double.valueOf(sumYear) / countRows));


    }
}
