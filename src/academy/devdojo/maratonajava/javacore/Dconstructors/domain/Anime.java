package academy.devdojo.maratonajava.javacore.Dconstructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String genre;
    private String studio;

    //Constructors don't have any return type
    //we need a constructor to create an object
    //if we don't define a constructor in the class, Java will add one automatically.
    public Anime(String name, String type, int episodes, String genre) {
        //in order to call a constructor inside another we use a alternative syntax
        this();//we can't utilize that syntax outside constructors
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
        //constructors forces us to follow a few rules, for example:
        //now we can't create an Anime object without a name
        //they are initialized before all the methods
    }

    //we can also overload constructors ex:
    public Anime(String name, String type, int episodes, String genre, String studio) {
        this(name, type, episodes, genre);
        //if we need to call another constructor, the this keyword must be at the first executable lina
        //of the constructor body
        this.studio = studio;

    }

    public Anime() {
        System.out.println("Inside the constructor without parameters");

    }


    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
        System.out.println(this.studio);

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
