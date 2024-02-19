package academy.devdojo.maratonajava.javacore.Cmethodoverload.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String genre;

    //Constructors don't have any return type
    //we need a constructor to create an object
    //if we don't define a constructor in the class, Java will add one automatically.
    public Anime() {
        //this class will be continued in the constructors package

    }

    //method overload is when we have two methods with the same name
    //differing in the quantity or types of parameters
    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    //we added a new parameter into the second init() method
    public void init(String name, String type, int episodes, String genre) {
        //we can't have ambiguity between the methods, they must have some difference
        this.init(name, type, episodes);//we can assignt the responsibility of these attributes
        this.genre = genre;             //to the first init method. in order to not repeat code
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
