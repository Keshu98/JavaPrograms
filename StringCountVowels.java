import java.util.Scanner;

public class StringCountVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        int count = 0;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Number of Vowels = " + count);
        sc.close();
    }
}