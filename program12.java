import java.util.Scanner;
//12. Write a program to print the series 2, 4, 6, … n.
public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Series of even numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
