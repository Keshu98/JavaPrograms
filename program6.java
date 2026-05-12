import java.util.Scanner;

//Program to Swap Two Numbers Using a Third Variable
public class program6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        sc.close();
    }
}
