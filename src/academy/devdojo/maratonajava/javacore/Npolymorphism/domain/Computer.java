package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Computer extends Product{
    public static final double COMPUTER_TAX = 0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating computer taxes");
        return this.value * COMPUTER_TAX;
    }

}
