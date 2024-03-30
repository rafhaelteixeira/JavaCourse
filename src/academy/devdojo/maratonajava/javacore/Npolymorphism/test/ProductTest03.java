package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomatoe;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.TaxesCalculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Tomatoe tomatoe = new Tomatoe("American", 20);
        tomatoe.setExpirationDate("11/12/2021");

        TaxesCalculator.calculateTax(tomatoe);
        System.out.println("------------------");
        TaxesCalculator.calculateTax(product);

    }
}
