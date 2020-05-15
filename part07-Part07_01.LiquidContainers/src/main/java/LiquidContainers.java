
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                System.out.println("First:" + "0/100" );
                System.out.println("Second:" + "0/100" );
                break;
            }
            String[] inputs = input.split(" ");
            if (inputs[0].equals("add")) {
                if (Integer.valueOf(inputs[1]) <= 0) {
                    continue;
                }
                int newCant = firstContainer + Integer.valueOf(inputs[1]);
                if (newCant > 100) {
                    firstContainer = 100;
                } else {
                    firstContainer = newCant;
                }
                System.out.println("First:" + firstContainer + "/100" );
                System.out.println("Second:" + secondContainer + "/100" );
            }
            
            if (inputs[0].equals("move")) {
                if (Integer.valueOf(inputs[1]) <= 0) {
                    continue;
                }
                int toMove = Integer.valueOf(inputs[1]);
                if (firstContainer - toMove < 0) {
                    toMove = firstContainer;
                    firstContainer = 0;
                } else {
                    firstContainer = firstContainer - toMove;
                }
                int newCant2 = secondContainer + toMove;
                if (newCant2 > 100) {
                    secondContainer = 100;
                } else {
                    secondContainer = newCant2;
                }
                System.out.println("First:" + firstContainer + "/100" );
                System.out.println("Second:" + secondContainer + "/100" );
            }
            
            if (inputs[0].equals("remove")) {
                if (Integer.valueOf(inputs[1]) <= 0) {
                    continue;
                }
                System.out.println(firstContainer);
                int newCant = secondContainer - Integer.valueOf(inputs[1]);
                if (newCant < 0) {
                    secondContainer = 0;
                } else {
                    secondContainer = newCant;
                }
                System.out.println("First:" + firstContainer + "/100" );
                System.out.println("Second:" + secondContainer + "/100" );
            }
                    

        }
    }

}
