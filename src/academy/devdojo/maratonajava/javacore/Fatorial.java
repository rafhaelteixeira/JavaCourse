package academy.devdojo.maratonajava.javacore;

public class Fatorial {
    public static void main(String[] args) {
        int i, fatorial = 1;
        int numero = 10;

        for (i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial de " + numero + " é " + fatorial);
    }
}
