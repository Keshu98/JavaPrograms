import java.util.Scanner;
//Program to Convert Fahrenheit to Celsius

public class program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius = " + celsius);

        sc.close();
    }
}