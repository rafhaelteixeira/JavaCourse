package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Given an annual salary, calculate the value to be paid in taxes
//Netherlands Taxes: salary from 0 to 34712 = 9.70% / 34713 to 60507 = 35.35% / > 68508 = 49.50%
public class TaxesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your salary");
        double salary = input.nextDouble();
        double taxes;
        double salaryAfterTaxes;

        if (salary <= 34712) {
            taxes = (salary * 9.7 / 100);
            salaryAfterTaxes = salary - taxes;

        } else if (salary >= 34713 && salary <= 60507) {
            taxes = (salary * 35.35 / 100);
            salaryAfterTaxes = salary - taxes;
        } else {
            taxes = (salary * 49.50 / 100);
            salaryAfterTaxes = salary - taxes;
        }
        System.out.println("Total taxes: " + taxes);
        System.out.println("Salary after taxes: " + salaryAfterTaxes);
    }
}
