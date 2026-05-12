import java.util.Scanner;
//20. Write a program to find the Sum of digits of a number.
public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits is: " + sum);

        sc.close();
    }
}
