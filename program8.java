import java.util.Scanner;

//8. Write a program to calculate the salary of a person (basic + allowances – deductions like this 5 attributes).
public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basicSalary, hra, da, ta, deductions, netSalary;

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();

        System.out.print("Enter TA: ");
        ta = sc.nextDouble();

        System.out.print("Enter Deductions: ");
        deductions = sc.nextDouble();

        netSalary = basicSalary + hra + da + ta - deductions;

        System.out.println("Net Salary = " + netSalary);

        sc.close();
    }
}
