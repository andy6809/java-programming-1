
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String m1 = scanner.nextLine();
            if (m1.equals("")) {
                break;
            } else {
                Item newItem = new Item(m1);
                items.add(newItem);
            }
        }
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
