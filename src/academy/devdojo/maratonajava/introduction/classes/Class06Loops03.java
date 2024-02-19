package academy.devdojo.maratonajava.introduction.classes;

//Given the value of a car, find out in how many invoices it can be financed
//condition, invoice value >= 1000
public class Class06Loops03 {
    public static void main(String[] args) {
        double totalValue = 30000;

        for (int invoice = 1; invoice <= totalValue; invoice++) {
            double invoiceValue = totalValue / invoice;
            if (invoiceValue < 1000) {
                break;
            }
            System.out.println(invoiceValue + " Inside the for " + invoice);
        }//we can also use the continue keyword to keep the loop running
    }
}
