import java.util.Scanner;
//30.Write a program to find the sum of nth element in a series.
public class program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Summing the first n natural numbers
        }
        System.out.println("The sum of the first " + n + " elements in the series is: " + sum);
        sc.close();
    }
}
