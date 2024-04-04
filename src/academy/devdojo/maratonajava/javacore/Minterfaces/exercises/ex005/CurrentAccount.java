package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex005;

public class CurrentAccount implements Account{

    private double balance;
    private double overDraftLimit;

    public CurrentAccount(double balance, double overDraftLimit) {
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;

    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
}
