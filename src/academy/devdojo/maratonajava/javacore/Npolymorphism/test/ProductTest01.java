package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Television;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomatoe;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.TaxesCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Nuc10i7", 11000);
        Tomatoe tomatoe = new Tomatoe("Sicilian Tomatoe", 10);
        Television tv = new Television("Samsung 50\" ", 5000);

        TaxesCalculator.calculateTax(computer);
        System.out.println("------------------------------");
        TaxesCalculator.calculateTax(tomatoe);
        System.out.println("------------------------------");
        TaxesCalculator.calculateTax(tv);
    }
}
