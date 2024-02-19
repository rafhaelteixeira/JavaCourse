package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.BankAccount;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 1234;
        bankAccount.balance = 10000;
        byte choice = 0;

        System.out.println("Choose a Transaction ");
        System.out.println("Type 1 for deposit and 2 for withdrawl: ");
        choice = input.nextByte();


        if (choice == 1) {
            System.out.println("Balance Before Deposit " + bankAccount.balance);
            System.out.println("Type the value of the deposit: ");
            bankAccount.deposit();
            System.out.println("Total Balance After Deposit : " + bankAccount.balance);
        } else if (choice == 2) {
            System.out.println("Balance Before Withdrawl " + bankAccount.balance);
            System.out.println("Type the value of the Withdrawl: ");
            bankAccount.withdrawl();
            System.out.println("Total Balance After Withdrawl: " + bankAccount.balance);
        }


    }
}
