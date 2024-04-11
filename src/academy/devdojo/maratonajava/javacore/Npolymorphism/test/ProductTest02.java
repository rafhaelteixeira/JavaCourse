package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomatoe;

public class ProductTest02 {
    public static void main(String[] args) {
        //Utilizing Product refference variable, but a Computer Object
        Product product = new Computer("Ryzen 9", 3000);
        //even though we have a Product variable, the methods will be executed by the Computer Object
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calculateTax());
        //Outputs Computer name, value and taxes implemented on the Computer child class
        //this practice is called widening casting, where a most especific type
        //makes a refference to the most generic type
        //A superclass on the left side and a child class on the right side

        System.out.println("------------------");

        Product product2 = new Tomatoe("American", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculateTax());
    }
}
