package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain;
/*Design a class representing a bank account.
Overload methods for depositing and withdrawing money,
allowing different parameter types (e.g., integer amount, double amount).*/
public class Banking {

    private int amount;
    private double amountDouble;
    private double balance = 2000;

    public void deposit(int amount) {
        this.amount = amount;
        balance += amount;
    }

    public void deposit(double amountDouble) {
        this.amountDouble = amountDouble;
        balance += amountDouble;
    }

    public void withdrawl(int amount) {
        this.amount = amount;
        balance -= amount;
    }

    public void withdrawl(double amountDouble) {
        this.amountDouble = amountDouble;
        balance -= amountDouble;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getAmountDouble() {
        return amountDouble;
    }

    public void setAmountDouble(double amountDouble) {
        this.amountDouble = amountDouble;
    }

    public double getBalance(){
        return balance;
    }
}
