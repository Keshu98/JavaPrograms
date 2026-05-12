import java.util.Scanner;

//19. Write a program to print the Fibonacci series.
public class program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, a = 0, b = 1;

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        n = sc.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        sc.close();
    }
}
