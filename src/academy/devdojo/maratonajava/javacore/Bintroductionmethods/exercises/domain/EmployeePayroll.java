package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Employee Payroll System: Design an Employee class with attributes like name, employee ID, and hourly wage.
Implement methods to calculate the weekly pay based on the number of hours worked.*/
public class EmployeePayroll {
    public String name;
    public int id;
    public double dailyHours = 8;
    public double dailyPay;
    public double weeklyPay;

    public double calculateDailyPay(double hourlyWage) {
        dailyPay = hourlyWage * dailyHours;
        return dailyPay;
    }
    public double calculateWeeklyPay(double weekDays) {
        weeklyPay = dailyPay * weekDays;
        return weeklyPay;
    }
}
