package academy.devdojo.maratonajava.javacore.EInitializationblocks.exercises.test;

import academy.devdojo.maratonajava.javacore.EInitializationblocks.exercises.domain.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new String[]{"Bananas"}, 1);

        for (int i = 0; i < cart.getName().length; i++) {
            System.out.println(cart.getName()[i] + " ");
        }
        System.out.println("Final Price: US$" + cart.calculateFinalPrice());
    }
}
