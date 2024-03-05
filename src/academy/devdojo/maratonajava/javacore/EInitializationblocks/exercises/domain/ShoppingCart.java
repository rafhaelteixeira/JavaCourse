package academy.devdojo.maratonajava.javacore.EInitializationblocks.exercises.domain;

/*Create a class representing a shopping cart item with attributes such as name, price, and quantity.
Implement an initializer block to initialize an array containing
the names of different products available in the store.*/
public class ShoppingCart {
    private String[] name;
    private final double price = 3.95;
    public final int quantity;

    {
        System.out.println("all items for: " + this.price);
        this.name = new String[]{"Bananas", "Apples", "Oranges", "Coconuts", "Peaches\n"};
        for (String s : name) {
            System.out.print(s + " ");
        }
        System.out.print("-----------------------------------------------\n");
    }

    public ShoppingCart(String[] name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public double calculateFinalPrice() {
        return this.price * this.quantity;
    }

    public String[] getName() {
        return this.name;
    }

}
