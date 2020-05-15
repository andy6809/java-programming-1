
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        while(true){
            String m1 = scanner.nextLine();
            if (m1.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            String m2 = scanner.nextLine();
            System.out.println("Identification number: ");
            String m3 = scanner.nextLine();
            PersonalInformation persInf = new PersonalInformation(m1, m2, m3);
            infoCollection.add(persInf);
        }
        for (PersonalInformation pers: infoCollection) {
            System.out.println(pers.getFirstName() + " " + pers.getLastName());
        }

    }
}
