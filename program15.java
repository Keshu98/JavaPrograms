import java.util.Scanner;
//15.Program to Print the Series 1 – 2 + 3 – 4 + 5 – 6 … n

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print("-" + i + " ");
            } else {
                if (i != 1) {
                    System.out.print("+");
                }
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
