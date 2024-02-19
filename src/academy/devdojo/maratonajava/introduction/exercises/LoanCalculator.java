package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

// input valor casa, salario e anos que ele vai pagar
//calcular valor da prestação mensal - não pode exceder 30% salário
public class LoanCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da casa: ");
        double valorDaCasa = input.nextInt();

        System.out.println("Digite o seu salário");
        double valorSalario = input.nextDouble();

        System.out.println("Digite em quantos anos você quer pagar: ");
        int anos = input.nextInt();
        int meses = anos * 12;

        double prestacao = valorDaCasa / meses;
        double porcentagemSalario = valorSalario * 30 / 100;

        String resultado = prestacao >= porcentagemSalario ? "Nao pode comprar a casa" : "pode comprar a casa";
        System.out.println(resultado);
    }
}
