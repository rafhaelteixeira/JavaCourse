package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex005;

import academy.devdojo.maratonajava.javacore.Kenum.exercises.ex004.CoffeeType;

public class CurrencyShop {
    public String getCurrencyType(Currency symbol){
        return symbol.getSymbol();
    }

    public void displayCurrencies(){
        System.out.println("Currencies:");
        for (Currency type : Currency.values()) {
            System.out.println(type + ": " + type.getSymbol());

        }
}
}
