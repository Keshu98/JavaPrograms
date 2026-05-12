import java.util.Scanner;
//21. Write a program to check whether a number is a Palindrome.
public class program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, originalNum, reversedNum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        originalNum = num;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        sc.close();
    }
}
