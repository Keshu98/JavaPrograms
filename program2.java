import java.util.Scanner;
//2. Program to Find the Average of Three Numbers   
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double average;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        average = (a + b + c) / 3.0;

        System.out.println("Average = " + average);

        sc.close();
    }
}