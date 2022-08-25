package Com.Tutorial;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String 1 :");
        String st1 = sc.next().toString();

        System.out.println("Enter a String 2 :");
        String st2 = sc.next().toString();
        int st = Integer.parseInt(String.valueOf(st1.compareTo(st2)));

        if (st == 0) {
            System.out.println(" String 1 and 2 are True");
        } else {
            System.out.println("String 1 and 2 are False");
        }
    }
}

