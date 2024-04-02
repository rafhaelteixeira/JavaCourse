package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex003;

public abstract class BankAccount {

    protected int accountNumber;
    protected double accountBalance;

    public BankAccount(int accountNumber, double AccountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = AccountBalance;
    }

    public abstract void deposit(double deposit);

    public abstract void withdrawl(double withdrawl);

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
