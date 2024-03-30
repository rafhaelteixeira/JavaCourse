package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex001;

public enum CardSuit {
    HEARTS("Hearts","Red"),
    DIAMONDS("Diamonds","Red"),
    CLUBS("Clubs","Black"),
    SPADES("Spades","Black");

    private final String name;
    private final String color;

    CardSuit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}
