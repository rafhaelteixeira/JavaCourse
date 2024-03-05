package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex003;

public class Main {
    public static void main(String[] args) {
        PremiumAccount account = new PremiumAccount("3179-8", "39855-1", 0);

        account.deposit(1000);
        account.deposit(500);
        account.withdrawl(250);
        account.calculateIncome();
        System.out.println(account.getBalance());
    }
}
