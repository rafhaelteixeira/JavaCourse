package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.EmployeePayroll;

import java.util.Scanner;


public class EmployeePayrollTest {
    public static void main(String[] args) {
        EmployeePayroll employee = new EmployeePayroll();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our payments calculator system");
        System.out.println("Type your name, ID, hourly wage, and how many days you worked this week:");

        System.out.print("Name: ");
        String name = input.next();
        employee.setName(name);

        System.out.print("ID: ");
        int id = input.nextInt();
        employee.setId();

        System.out.print("Hourly Wage (use \",\" to separate the decimals): ");
        double hourlyWage = input.nextDouble();
        employee.calculateDailyPay(hourlyWage);

        System.out.print("Days worked this week: ");
        int weekDays = input.nextInt();
        employee.calculateWeeklyPay(weekDays);

        System.out.println("Your daily pay: " + employee.getDailyPay());
        System.out.println("Your weekly pay this week: " + employee.getWeeklyPay());

    }
}
