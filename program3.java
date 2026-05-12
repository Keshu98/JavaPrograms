import java.util.Scanner;
//Program to Calculate the Area of a Circle
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        area = 3.14 * radius * radius;

        System.out.println("Area of Circle = " + area);

        sc.close();
    }
}