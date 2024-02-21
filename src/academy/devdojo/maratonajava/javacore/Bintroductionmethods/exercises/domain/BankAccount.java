package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Create a BankAccount class with attributes accountNumber,
balance, and methods to deposit and withdraw money.*/
public class BankAccount {
    private double balance;

    public void deposit(double deposit) {
        if (deposit <= 0) {
            System.out.println("Invalid deposit");
            return;
        }
        this.balance += deposit;
    }

    public void withdrawl(double withdrawl) {
        if (withdrawl <= 0) {
            System.out.println("Invalid withdrawl");
            return;
        }
        balance -= withdrawl;
    }

    public void setAccountNumber() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
