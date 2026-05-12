import java.util.Scanner;
//13. Write a program to print the series 1, 3, 6, 10, … n.
public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Serries is:");
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }

        sc.close();
    }
}
