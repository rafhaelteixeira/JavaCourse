package academy.devdojo.maratonajava.introduction.classes;

public class Class06Loops04 {
    public static void main(String[] args) {
        double totalValue = 30000;

        for (int invoice = (int) totalValue; invoice >= 1; invoice--) {
            double invoiceValue = totalValue / invoice;
            if (invoiceValue < 1000) {
                continue;
            }
            System.out.println("Invoice " + invoice + " US$ " + invoiceValue);
        }
    }
}
