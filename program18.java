import java.util.Scanner;
//18. Write a program to find the Factorial of a number.
public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        long factorial = 1;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        sc.close();
    }
}
