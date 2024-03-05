package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex003;

/*Create a banking system with a superclass Account and subclasses like SavingsAccount,
CheckingAccount, and LoanAccount. Each subclass can have methods for deposit, withdrawal,
and specific behavior related to the type of account.*/
public class Account {
    protected String agency;
    protected String accountNumber;
    protected double balance;

    public Account(String agency, String accountNumber, double balance) {
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double deposit) {
        if (deposit <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance = balance + deposit;
        }
    }

    public void withdrawl(double withdrawl) {
        if (balance <= 0) {
            System.out.println("You have no balance.");
        } else if (withdrawl <= 0) {
            System.out.println("Invalid withdrawl.");
        } else {
            balance = balance - withdrawl;
        }
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
