import java.util.Scanner;
//Program to Swap Two Numbers Without Using a Third Variable
public class program7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        sc.close();
    }
}

