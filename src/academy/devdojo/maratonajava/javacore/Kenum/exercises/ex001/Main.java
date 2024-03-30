package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex001;

public class Main {
    public static void main(String[] args) {
        Card aceOfHearts = new Card(1, CardSuit.HEARTS);
        Card tenOfDiamonds = new Card(10, CardSuit.DIAMONDS);
        Card kingOfClubs = new Card(13, CardSuit.CLUBS);
        Card twoOfSpades = new Card(2, CardSuit.SPADES);

        System.out.println(aceOfHearts.getFullName());
        System.out.println(tenOfDiamonds.getFullName());
        System.out.println(kingOfClubs.getFullName());
        System.out.println(twoOfSpades.getFullName());

    }
}
