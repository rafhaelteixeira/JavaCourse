package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex004;

public enum CoffeeType {
    ESPRESSO(1.95),
    LATTE(2.35),
    CAPPUCCINO(3.20),
    ICED_COFFEE(2.20);

    private final double price;
    CoffeeType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
