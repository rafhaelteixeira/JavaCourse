package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        //creating objects with necessary arguments
        Player player = new Player("Cafú");
        Player player2 = new Player("Pelé");
        //only one team created
        Team team = new Team("Brazil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("--- Players ---");
        player.print();
        player2.print();
        System.out.println("--- Team ---");
        team.print();
    }
}
