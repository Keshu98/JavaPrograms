
import java.util.Scanner;
//1. Program to Find Length of a String
public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("Length of String = " + str.length());
        sc.close();
    }
}