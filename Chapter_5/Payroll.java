import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number >> ");
        int empNumber = input.nextInt();
        System.out.print("How many hours did you work this week? ");
        double hours = input.nextDouble();
        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        Employee emp = new Employee(empNumber, rate);

        double regularPay = emp.calculateRegularPay(hours);
        double overtimePay = emp.calculateOvertimePay(hours);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}
