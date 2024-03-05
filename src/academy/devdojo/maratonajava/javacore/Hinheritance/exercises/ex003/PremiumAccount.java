package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex003;

public class PremiumAccount extends Account {
    public final double creditCard = 10000;
    public final double incomePercentage = 0.005;

    public PremiumAccount(String agency, String accountNumber, double balance) {
        super(agency, accountNumber, balance);
    }

    public void calculateIncome() {
        double dailyIncome = balance * this.incomePercentage;
        balance = balance + dailyIncome;
    }

    public double getCreditCard() {
        return creditCard;
    }

    public double getIncomePercentage() {
        return incomePercentage;
    }
}
