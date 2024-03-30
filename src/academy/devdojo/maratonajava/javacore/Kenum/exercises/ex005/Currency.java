package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex005;

public enum Currency {
    USD("$"),
    GPB("£"),
    EUR("€"),
    JPY("¥"),
    BRL("R$");

    private String symbol;
    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
