import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String m1 = scanner.nextLine();
            if (m1.equals("")) {
                break;
            } else {
                System.out.println("Pages: ");
                int m2 = Integer.valueOf(scanner.nextLine());
                System.out.println("Publication Year: ");
                int m3 = Integer.valueOf(scanner.nextLine());
                Book program = new Book(m1, m2, m3);
                books.add(program);
            }
        }
        System.out.println("What information will be printed? ");
        String m4 = scanner.nextLine();
        if (m4.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
                }
            } else {
                for (Book book: books) {
                    System.out.println(book.getName());
                    }
            }
        }
    }
