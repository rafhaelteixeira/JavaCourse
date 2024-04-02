package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex003;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1234, 20000);
        savingsAccount.deposit(3000);
        savingsAccount.withdrawl(500);
        System.out.println("savings account balance" + " " + savingsAccount.getAccountBalance());

        System.out.println("--------------------------------------------");

        CurrentAccount currentAccount = new CurrentAccount(1234,0,8);
        currentAccount.deposit(0);
        currentAccount.withdrawl(500);
        System.out.println("Current Account Balance" + " " + currentAccount.getAccountBalance());
}}
