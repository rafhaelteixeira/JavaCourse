package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex004;
public class CoffeeShop {
    public double getCoffeePrice (CoffeeType type){
        return type.getPrice();
    }

    public void displayCoffees(){
        System.out.println("Coffees:");
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type + ": $" + type.getPrice());
            
        }

    }
}
