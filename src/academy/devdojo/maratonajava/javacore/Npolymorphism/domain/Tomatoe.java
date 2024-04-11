package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Tomatoe extends Product{
    public static final double TOMATOE_TAX = 0.06;
    //by adding an attribute that is not present on the superclass
    //we can't call this attribute with a Product refference type
    private String expirationDate;
    public Tomatoe(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tomatoe taxes");
        return this.value * TOMATOE_TAX;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
