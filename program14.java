import java.util.Scanner;
//14.Program to Find the Sum of the Series 1 + 2 + 3 + … + n
public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of the series from 1 to " + n + " is: " + sum);

        sc.close();
    }
}
