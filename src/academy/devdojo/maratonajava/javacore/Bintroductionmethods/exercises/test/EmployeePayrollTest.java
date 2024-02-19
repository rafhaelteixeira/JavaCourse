package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.EmployeePayroll;

public class EmployeePayrollTest {
    public static void main(String[] args) {
        EmployeePayroll employee = new EmployeePayroll();

        employee.name = "Rafhael";
        employee.id = 123;
        employee.dailyPay = employee.calculateDailyPay(35.50);
        employee.weeklyPay = employee.calculateWeeklyPay(5);

        System.out.println("Eployee: " + employee.name + "\n With the ID: " + employee.id + "\n Received daily: "
                + employee.dailyPay + "\n Therefore, Weekly: " + employee.weeklyPay);
    }
}
