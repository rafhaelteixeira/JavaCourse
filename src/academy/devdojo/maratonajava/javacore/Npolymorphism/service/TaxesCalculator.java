package academy.devdojo.maratonajava.javacore.Npolymorphism.service;


import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomatoe;


public class TaxesCalculator {

    public static void calculateTax(Product product){
        System.out.println("Taxes Relatory");
        double tax = product.calculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getValue());
        System.out.println("Taxes: " + tax);

        if (product instanceof Tomatoe){
        Tomatoe tomatoe = (Tomatoe) product;
        System.out.println(tomatoe.getExpirationDate());
        }
    }
}
