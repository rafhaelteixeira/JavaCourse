package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romário");
        Player player3 = new Player("Cafú");
        //creating an array of players to store them
        Player[] players = {player1, player2, player3};
        //the array type will be the object's type
        //we are referencing 3 independent objects

        //iterating over the array, in order to print the values on the array's indexes.
        //this concept will be the same on the lists, maps and hashes, except we'll utilize libraries
        for (Player player : players) {
            player.print();
        }
    }
}
