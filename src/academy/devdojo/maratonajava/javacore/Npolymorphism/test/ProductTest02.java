package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomatoe;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calculateTax());

        System.out.println("------------------");

        Product product2 = new Tomatoe("American", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculateTax());
    }
}
