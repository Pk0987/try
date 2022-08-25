package Com.Tutorial;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println(" 1.Press 1 \n 2.Press 2 \n 3.Press 3 \n Enter a Option (1 or 2): ");
        option = sc.nextInt();

        switch (option) {
            case 1:

                System.out.println("This is one");
                String x = sc.next().toString();
                break;

            case 2:

                System.out.println("This is two");
                String y = sc.next().toString();
                break;

            case 3:
                System.out.println("This is three");
                String z = sc.next().toString();

            default:
                System.out.println("You Entered a Invalid Option");
        }


    }
}