import java.util.Scanner;
//22. Write a program to check whether a number is an Armstrong number.
public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, originalNum, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        originalNum = num;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Add the cube of the digit to sum
            num /= 10; // Remove the last digit
        }

        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}
