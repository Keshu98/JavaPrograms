import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str, reverse = "";

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        sc.close();
    }

}