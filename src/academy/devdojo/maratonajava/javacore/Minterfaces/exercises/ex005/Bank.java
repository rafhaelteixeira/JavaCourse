package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex005;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void deposit(Account account, double amount){
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount){
        account.withdraw(amount);
    }

    public List getAccounts() {
        return accounts;
    }

    public void printAccountBalances(List<Account> accounts){
        for (Account account : accounts){
            System.out.println("Account Balance: " + account.getBalance());
        }

    }
}
