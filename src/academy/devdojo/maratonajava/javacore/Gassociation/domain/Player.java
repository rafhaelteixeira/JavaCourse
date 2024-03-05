package academy.devdojo.maratonajava.javacore.Gassociation.domain;
//arrays with objects
//we have a few types of relationships between objects
//1 -- 1 | 1 -- N | N -- 1 | N -- N
//we can have unidirectional and bidirectional relationships
//unidirectional, one object references the other and the contrary doesn't happen
//birectional, both objects reference one another, whether with a simple value, or with an array of values.
public class Player {
    private String name;
    //player is part of one team, so it has one team object
    private Team team;

    public void print(){
        System.out.println(this.name);
        //there's a possibility that the team is non-existing, so we have to test out with an if statement
        if (team != null){
            System.out.println(team.getName());
        }

    }
    public Player(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
