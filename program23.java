import java.util.Scanner;
//23. Write a program to find the sum of the cubes of digits of a number.
public class program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Add the cube of the digit to sum
            num /= 10; // Remove the last digit
        }

        System.out.println("Sum of the cubes of digits is: " + sum);

        sc.close();
    } 
}
