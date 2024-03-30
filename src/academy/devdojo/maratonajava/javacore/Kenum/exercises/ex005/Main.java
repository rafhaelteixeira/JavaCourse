package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex005;

import academy.devdojo.maratonajava.javacore.Kenum.exercises.ex004.CoffeeShop;
import academy.devdojo.maratonajava.javacore.Kenum.exercises.ex004.CoffeeType;

public class Main {
    public static void main(String[] args) {
        CurrencyShop currencyShop = new CurrencyShop();

        currencyShop.displayCurrencies();

        System.out.println("---------------------------");

        Currency currency = Currency.BRL;
        System.out.println("Symbol of " + currency + " = " + currencyShop.getCurrencyType(currency));
    }
}
