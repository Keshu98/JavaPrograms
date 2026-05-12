import java.util.Scanner;
//1. Program to Find the Sum of Two Numbers
public class program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, sum;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}