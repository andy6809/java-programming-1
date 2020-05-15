
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String m1 = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get(m1))) {
            while (scanner2.hasNextLine()) {
                String m2 = scanner2.nextLine();
                System.out.println(m2);
            }
        } catch (Exception e) {
            System.out.println("Errow");       
        }

    }
}
