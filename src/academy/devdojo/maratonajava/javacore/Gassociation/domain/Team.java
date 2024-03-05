package academy.devdojo.maratonajava.javacore.Gassociation.domain;

public class Team {
    private String name;
    //now we'll see bidirectional realationships
    //in this case, a team has an array of players, and a player has 1 team
    //so both classes instantiate one another in some way
    private Player[] players;

    //constructors
    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    //print method
    public void print() {
        System.out.println(this.name);
        if (players == null) {
            return;
        }
        for (Player player : players) {
            System.out.println(player.getName());
        }

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
