package academy.devdojo.maratonajava.javacore.EInitializationblocks.domain;

public class Anime {
    private String name;
    private int[] episodes;
    //1 - memory space allocated for the object
    //2 - each class attribute is created and initialized with default values, or what is passed.
    //3 - initialization block is executed
    //4 - Constructor is executed

    //instance initialization blocks are executed when an object is created
    //they are executed before the constructors and methods
    //we can add a logic inside, in order to not repeat code every time we instantiate an object
    {
        System.out.println("Inside the block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : this.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
