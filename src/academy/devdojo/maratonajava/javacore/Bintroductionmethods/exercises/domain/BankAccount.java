package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

import java.util.Scanner;

/*Create a BankAccount class with attributes accountNumber,
balance, and methods to deposit and withdraw money.*/
public class BankAccount {
    public int accountNumber;
    public double balance;
    Scanner input = new Scanner(System.in);

    public double deposit() {
        double deposit = input.nextDouble();
        if (deposit <= 0) {
            System.out.println("Invalid Deposit Value");
        }
        balance += deposit;
        return balance;
    }

    public double withdrawl() {
        double withdrawl = input.nextDouble();
        if (withdrawl <= 0) {
            System.out.println("Invalid Deposit Value");
        }
        balance -= withdrawl;
        return balance;

    }
}
