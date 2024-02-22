package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.test;

import academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setName("Peanuts"); cart.setPrice(6.25); cart.setQuantity(2);
        cart.addItems(cart.getName(), cart.getPrice());
        cart.addItems(cart.getName(), cart.getPrice(), cart.getQuantity());

    }
}
