import java.util.Scanner;
//17. Write a program to check whether a number is Prime.
public class program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }
}
