package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex004;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        coffeeShop.displayCoffees();

        System.out.println("---------------------------");

        CoffeeType coffeeType = CoffeeType.LATTE;
        System.out.println("Price of " + coffeeType + " = " + coffeeShop.getCoffeePrice(coffeeType));

    }
}
