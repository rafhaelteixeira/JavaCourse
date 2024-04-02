package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex003;

public class CurrentAccount extends BankAccount{
    private int clientScore;
    public CurrentAccount(int accountNumber, double accountBalance, int clientScore) {
        super(accountNumber, accountBalance);
        this.clientScore = clientScore;
    }

    @Override
    public void deposit(double deposit) {
        accountBalance += deposit;
    }

    @Override
    public void withdrawl(double withdrawl) {
        if (clientScore > 7 && accountBalance < withdrawl){
            accountBalance -= withdrawl;
        } else if (clientScore <8 && accountBalance < withdrawl) {
            System.out.println("You have no credit");
            return;
        } else if (accountBalance > withdrawl) {
             accountBalance -= withdrawl;
        }

    }

    @Override
    public int getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    public int getClientScore() {
        return clientScore;
    }
}
