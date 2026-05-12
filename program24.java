//24. Write a program to print the multiplication table of a number.
import java.util.Scanner;
public class program24 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.print("Enter a number to print its multiplication table: ");
    num = sc.nextInt();

    System.out.println("Multiplication table of " + num + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
    }

    sc.close();
}
}
