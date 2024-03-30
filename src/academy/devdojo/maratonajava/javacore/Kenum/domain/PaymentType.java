package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum PaymentType {
    //in order to not repeat code, we can define methods behavior inside the enum types
    DEBIT{
        //we are overriding the calculate discount method that was declared outside the enum type
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    }, CREDIT{
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
        //we can now use the method, based on the enum value (DEBIT OR CREDIT)
    };

    public abstract double calculateDiscount(double value);
    //by abstracting the method, we can assign the calculus responsibility to the enum types scope methods
}