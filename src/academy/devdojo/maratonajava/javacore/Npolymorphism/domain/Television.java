package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Television extends Product{
    public static final double TELEVISION_TAX = 0.21;
    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating television taxes");
        return this.value * TELEVISION_TAX;
    }
}
