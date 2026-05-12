import java.util.Scanner;
//26. Write a program to print prime numbers between n and k.
public class program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;

        System.out.print("Enter the starting number (n): ");
        n = sc.nextInt();

        System.out.print("Enter the ending number (k): ");
        k = sc.nextInt();

        System.out.println("Prime numbers between " + n + " and " + k + ":");
        for (int i = n; i <= k; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
