package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Employee Payroll System: Design an Employee class with attributes like name, employee ID, and hourly wage.
Implement methods to calculate the weekly pay based on the number of hours worked.*/
public class EmployeePayroll {
    private String name;
    private double dailyPay;
    private double weeklyPay;

    public void calculateDailyPay(double hourlyWage) {
        double dailyHours = 8;
        this.dailyPay = hourlyWage * dailyHours;
    }
    public void calculateWeeklyPay(int weekDays) {
        weeklyPay = dailyPay * weekDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId() {
    }

    public double getDailyPay() {
        return dailyPay;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

}
