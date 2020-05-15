
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String m1 = scanner.nextLine();
        try (Scanner fileRead = new Scanner(Paths.get(m1))) {
            while (fileRead.hasNextLine()) {
                String[] data = fileRead.nextLine().split(",");
                System.out.println(data[0] + ", " + data[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }
        

    }
}
