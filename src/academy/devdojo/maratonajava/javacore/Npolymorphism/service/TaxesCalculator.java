package academy.devdojo.maratonajava.javacore.Npolymorphism.service;


import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomatoe;


public class TaxesCalculator {

    public static void calculateComputerTaxes(Computer computer) {
        System.out.println("Computer taxes relatory");
        double tax = computer.calculateTax();
        System.out.println("Computer " + computer.getName());
        System.out.println("Value " + computer.getValue());
        System.out.println("Taxes to be paid " + tax);
    }

    public static void calculateTomatoeTaxes(Tomatoe tomatoe) {
        System.out.println("Tomatoe taxes relatory");
        double tax = tomatoe.calculateTax();
        System.out.println("Tomatoe " + tomatoe.getName());
        System.out.println("Value " + tomatoe.getValue());
        System.out.println("Taxes to be paid " + tax);
    }

    //We can refactor the code above with the code bellow, by using the widening casting Polymorphism
    public static void calculateTax(Product product) {
        //this method will take an extended Product type as a parameter
        //the method will behave differently based on the product passed as an argument.
        //we can pass all the objects that extends the class Product
        System.out.println("Taxes Relatory");
        double tax = product.calculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getValue());
        System.out.println("Taxes: " + tax);

        //In order to get an attribute or method that exists only in the child class
        //we must use a technique called narrowing casting
        //it's the opposite of the widening casting
        if (product instanceof Tomatoe) {
            Tomatoe tomatoe = (Tomatoe) product;
            System.out.println(tomatoe.getExpirationDate());
        }
    }
}
