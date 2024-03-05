package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex003;

public class SavingsAccount extends Account {
    private final double incomePercentage = 0.003;

    public SavingsAccount(String agency, String accountNumber, double balance) {
        super(agency, accountNumber, balance);
    }

    public void calculateIncome() {
        double dailyIncome = balance * this.incomePercentage;
        balance = balance + dailyIncome;
    }

    public double getIncomePercentage() {
        return incomePercentage;
    }
}
