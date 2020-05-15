
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            String[] in = input.split(" ");
            if (input.equals("quit")) {
                System.out.println("First: 0/100" );
                System.out.println("Second: 0/100" );
                break;
            }
            if (in[0].equals("add")) {
                cont1.add(Integer.valueOf(in[1]));
            }
            if (in[0].equals("remove")) {
                cont2.remove(Integer.valueOf(in[1]));
            }
            
            if (in[0].equals("move")) {
                if (Integer.valueOf(in[1]) <= 0) {
                    continue;
                }
                int toMove = Integer.valueOf(in[1]);
                if (cont1.contains() - toMove < 0) {
                    toMove = cont1.contains();
                    cont1.setQuantity(0);
                } else {
                    cont1.setQuantity(cont1.contains() - toMove);
                }
                int newCant2 = cont2.contains() + toMove;
                if (newCant2 > 100) {
                    cont2.setQuantity(100);
                } else {
                    cont2.setQuantity(newCant2);
                }
            }
            System.out.println("First:" + cont1.contains() + "/100" );
            System.out.println("Second:" + cont2.contains() + "/100" );
            
        }
    }

}
