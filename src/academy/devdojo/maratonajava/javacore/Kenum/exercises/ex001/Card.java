package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex001;

public class Card {
    private int rank;
    private CardSuit suit;

    public Card(int rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getFullName(){
        String rankName;
        switch (rank){
            case 1:rankName = "Ace";
            break;
            case 11:rankName = "Jack";
                break;
            case 12:rankName = "Queen";
                break;
            case 13:rankName = "King";
                break;
            default:
                rankName = String.valueOf(rank);
        }
        return rankName + " Of " + suit.getName();

    }

}
