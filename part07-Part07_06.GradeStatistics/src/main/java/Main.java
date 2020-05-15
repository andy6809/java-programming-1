
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int m1 = Integer.valueOf(scanner.nextLine());
            if (m1 == -1){
                break;
            } else if (m1 < 0 | m1 > 100) {
                continue;
            } else {
                lista.add(m1);
            }
        }
        averages(lista);
        averagesPassing(lista);
        percentagesPassing(lista);
        gradeDistri(lista);
    }
    public static void averages(ArrayList<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        System.out.println("Point average (all): " + Double.valueOf(sum) / list.size());
    }
    
    public static void averagesPassing(ArrayList<Integer> list) {
        int sum = 0;
        int count = 0;
        for (int i: list) {
            if (i >= 50) {
                sum += i;
                count ++;
            }
        }
        if (count > 0) {
            System.out.println("Point average (passing): " + Double.valueOf(sum) / count);
        } else {
            System.out.println("Point average (passing): -");
        }
    }
    
    public static void percentagesPassing(ArrayList<Integer> list) {
        int count = 0;
        for (int i: list) {
            if (i >= 50) {
                count ++;
            }
        }
        System.out.println("Pass percentage " + 100 * Double.valueOf(count) / list.size());
    }

    public static void gradeDistri(ArrayList<Integer> list) {
        String zero = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";
        for (int i: list) {
            if (i < 50) {
                zero+="*";
            } else if (i < 60) {
                one+="*";
            } else if (i < 70) {
                two+="*";
            } else if (i < 80) {
                three+="*";
            } else if (i < 90) {
                four+="*";
            } else {
                five+="*";
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);  
    }
}
