package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex003;

public class SavingsAccount extends BankAccount{


    public final double WITHDRAWL_LIMIT = 5000;
    public SavingsAccount(int accountNumber, double AccountBalance) {
        super(accountNumber, AccountBalance);

    }

    @Override
    public void deposit(double deposit) {
        accountBalance += deposit;

    }

    @Override
    public void withdrawl(double withdrawl) {
        if (withdrawl > WITHDRAWL_LIMIT){
            System.out.println("Above withdrawl limit");
            return;
        }
        accountBalance -= withdrawl;

    }

    public void calculateMonthlyInterest(){
        accountBalance += accountBalance * 0.01;

    }

    @Override
    public int getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }
}
