
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String m1 = scan.nextLine();
        System.out.println("Team:");
        String m2  = scan.nextLine();
        int countGames = 0;
        int countWins = 0;
        int countLosses = 0;
        try (Scanner fileRead = new Scanner(Paths.get(m1))) {
            while (fileRead.hasNextLine()) {
                String[] data = fileRead.nextLine().split(",");
                if (data[0].equals(m2) | data[1].equals(m2)) {
                    countGames++;
                }
                if (data[0].equals(m2)) {
                    if (Integer.valueOf(data[2]) > Integer.valueOf(data[3])) {
                        countWins++;
                    } else{
                        countLosses++;
                    }
                }
                if (data[1].equals(m2)) {
                    if (Integer.valueOf(data[2]) < Integer.valueOf(data[3])) {
                        countWins++;
                    } else{
                        countLosses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }
        System.out.println("Games: " + countGames);
        System.out.println("Wins: " + countWins);
        System.out.println("Losses: " + countLosses);

    }

}
