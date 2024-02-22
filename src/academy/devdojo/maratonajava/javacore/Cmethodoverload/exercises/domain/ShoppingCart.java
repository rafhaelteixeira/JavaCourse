package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain;
/*Develop a class representing a shopping cart. Overload methods for adding items to the cart,
where each method can accept different parameters
(e.g., item name and quantity, item name and price).*/
public class ShoppingCart {
    private String name;
    private double price;
    private int quantity;

    public void addItems(String name, double price){
        this.name = name;
        this.price = price;
        System.out.println(name + " - R$" + price);
    }

    public void addItems(String name, double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println(name + " - R$" + price + " - " + quantity);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice (double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
