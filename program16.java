import java.util.Scanner;
//16Program to Find the Sum of the Series 1/2 + 2/3 + 3/4 + … n
public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1);
        }

        System.out.println("Sum of the series: " + sum);
        sc.close();
    }
}
