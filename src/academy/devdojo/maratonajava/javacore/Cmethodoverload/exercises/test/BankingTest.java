package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.test;

import academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain.Banking;

public class BankingTest {
    public static void main(String[] args) {
        Banking operation = new Banking();
        operation.deposit(250.80);

        operation.withdrawl(1200.58);
        System.out.println(operation.getBalance());




    }
}
