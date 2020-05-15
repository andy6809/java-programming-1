import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Name: ");
            String m1 = scanner.nextLine();
            if (m1.equals("")) {
                break;
            } else {
                int m2 = Integer.valueOf(scanner.nextLine());
                TelevisionProgram program = new TelevisionProgram(m1, m2);
                programs.add(program);
            }
        }
        System.out.print("Program's maximum duration? ");
        int m3 = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram pro: programs) {
            if (pro.getDuration() <= m3) {
                System.out.println(pro);
            }
        }
    }
}
